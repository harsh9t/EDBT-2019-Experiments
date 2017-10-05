 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/79052170");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "customer").has("customerID", "ALFKI").inE().outV().map()
println (System.currentTimeMillis() - q)
System.exit(0);
