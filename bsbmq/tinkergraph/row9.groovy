 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/54997849");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "product").has("label_n")[0..4].map("productID", "label_n")
println (System.currentTimeMillis() - q)
System.exit(0);
