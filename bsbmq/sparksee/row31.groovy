 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/bsbm.graphml("/tmp/786616135");
s.loadGraphML("/home/yashwant/edb/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "reviewer").has("reviewerID", 424).as('a').out().map().as('b').select()
println (System.currentTimeMillis() - q)
