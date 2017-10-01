 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/bsbm.graphml("/tmp/698010860");
s.loadGraphML("/home/yashwant/edb/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "offer")[0..4].map("price", "OfferWebPage")
println (System.currentTimeMillis() - q)
