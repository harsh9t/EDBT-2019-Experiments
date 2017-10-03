 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/bsbm.graphml("/tmp/431229470");
s.loadGraphML("/home/yashwant/edb/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("productID", 343).inE().outV().has("type", "review").map("Rating_1")[0..1]
println (System.currentTimeMillis() - q)
