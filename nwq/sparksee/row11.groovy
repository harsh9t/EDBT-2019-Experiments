 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/northwind.graphml("/tmp/81483845");
s.loadGraphML("/home/yashwant/edb/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("unitsOnOrder",0)[0..4].map("productName", "unitsOnOrder")
println (System.currentTimeMillis() - q)
