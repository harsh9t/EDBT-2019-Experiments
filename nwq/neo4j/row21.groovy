 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/northwind.graphml("/tmp/528396917");
s.loadGraphML("/home/yashwant/edb/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "product").order{it.b.unitsOnOrder <=> it.a.unitsOnOrder}[0..4].map("productName", "unitsOnOrder")
println (System.currentTimeMillis() - q)
