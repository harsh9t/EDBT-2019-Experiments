 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/707685859");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "product_type").has("productTypeID", 58).out().map("productID")
println (System.currentTimeMillis() - q)
System.exit(0);
