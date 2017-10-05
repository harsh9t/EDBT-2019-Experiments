 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/834949712");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("categoryID").map("categoryName")
println (System.currentTimeMillis() - q)
System.exit(0);
