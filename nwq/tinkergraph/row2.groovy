 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/975060682");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("description").map("description")
println (System.currentTimeMillis() - q)
System.exit(0);
