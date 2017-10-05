 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/345317389");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "review").outE().inV().productID.dedup.count()
println (System.currentTimeMillis() - q)
System.exit(0);
