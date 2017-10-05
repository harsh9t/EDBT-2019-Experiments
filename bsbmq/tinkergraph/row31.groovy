 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/283098130");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "reviewer").has("reviewerID", 424).as('a').out().map().as('b').select()
println (System.currentTimeMillis() - q)
System.exit(0);
