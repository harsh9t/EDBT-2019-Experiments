 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/850989599");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("categoryName", "Beverages").inE().outV().groupCount{it.unitsInStock}.cap
println (System.currentTimeMillis() - q)
System.exit(0);
