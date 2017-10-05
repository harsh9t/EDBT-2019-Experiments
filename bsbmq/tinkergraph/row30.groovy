 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/40341429");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "product").has("productID", 343).as('a').both().map().as('b').select()
println (System.currentTimeMillis() - q)
System.exit(0);
