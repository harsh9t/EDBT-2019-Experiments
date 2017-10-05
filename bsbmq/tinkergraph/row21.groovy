 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/97820040");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
q = System.currentTimeMillis();
tt =  s.V().has("type", "product").filter{it.productID==343 || it.productID == 350}.map()
println (System.currentTimeMillis() - q)
System.exit(0);
