 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/918187011");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "reviewer").groupCount{it.country}.cap
println (System.currentTimeMillis() - q)
System.exit(0);
