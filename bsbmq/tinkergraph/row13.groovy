 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/359361228");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "product").groupCount{it.ProductPropertyNumeric_4}.cap
println (System.currentTimeMillis() - q)
System.exit(0);
