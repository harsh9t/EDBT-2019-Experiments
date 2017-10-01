 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/northwind.graphml("/tmp/582433926");
s.loadGraphML("/home/yashwant/edb/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("productID").order{it.a.unitPrice <=> it.b.unitPrice}[0..5].map("productName", "unitPrice")
println (System.currentTimeMillis() - q)
