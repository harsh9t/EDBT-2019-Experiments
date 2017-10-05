 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/298387223");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("productName")[0..4].map("unitsInStock", "productName")
println (System.currentTimeMillis() - q)
System.exit(0);
