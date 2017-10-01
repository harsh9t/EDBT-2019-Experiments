 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/bsbm.graphml("/tmp/54459871");
s.loadGraphML("/home/yashwant/edb/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "reviewer").has("reviewerID", 86).outE().inV().has("Rating_1").outE().inV().map("productID")
println (System.currentTimeMillis() - q)
