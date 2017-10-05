 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/821344909");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "review").groupCount{it.Rating_3}.cap
println (System.currentTimeMillis() - q)
System.exit(0);
