 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/438353848");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
q = System.currentTimeMillis();
tt =  s.V().has("type", "review").has("Rating_1").out().has("type", "product").groupCount{it.productID}.cap()
println (System.currentTimeMillis() - q)
System.exit(0);
