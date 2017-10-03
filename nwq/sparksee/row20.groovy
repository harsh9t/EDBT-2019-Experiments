 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/northwind.graphml("/tmp/802636669");
s.loadGraphML("/home/yashwant/edb/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "product").order{it.b.unitsInStock <=> it.a.unitsInStock}[0..4].map("productName", "unitsInStock")
println (System.currentTimeMillis() - q)
