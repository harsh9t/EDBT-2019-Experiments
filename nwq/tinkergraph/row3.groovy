 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/northwind.graphml("/tmp/834329342");
s.loadGraphML("/home/yashwant/edb/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("productName").map("productName")
println (System.currentTimeMillis() - q)
