 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/277925647");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "offer")[0..4].map("price", "OfferWebPage")
println (System.currentTimeMillis() - q)
System.exit(0);
