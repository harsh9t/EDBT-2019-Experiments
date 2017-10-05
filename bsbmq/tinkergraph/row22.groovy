 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/32288776");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "vendor").filter{it.country=="RU" || it.country == "GB"}.map()
println (System.currentTimeMillis() - q)
System.exit(0);
