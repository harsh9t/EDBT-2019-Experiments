 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new SparkseeGraph("/tmp/35475560");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "vendor").groupCount{it.country}.cap
println (System.currentTimeMillis() - q)
System.exit(0);
