 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/746404032");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("unitsInStock", 0).map("unitsInStock", "productName")
println (System.currentTimeMillis() - q)
System.exit(0);
