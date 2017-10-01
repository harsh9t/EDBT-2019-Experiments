 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/northwind.graphml("/tmp/651842283");
s.loadGraphML("/home/yashwant/edb/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "product").order{it.b.unitsOnOrder <=> it.a.unitsOnOrder}[0..9].map("productName", "unitsOnOrder")
println (System.currentTimeMillis() - q)
