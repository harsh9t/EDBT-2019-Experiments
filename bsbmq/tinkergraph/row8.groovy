 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/656665524");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("productID", 343).inE().outV().has("type", "review").map("Rating_1")[0..1]
println (System.currentTimeMillis() - q)
System.exit(0);
