 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new SparkseeGraph("/tmp/627016845");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "order").outE().has("labelE", "orderedBy").inV().groupCount{it.customerID}.cap
println (System.currentTimeMillis() - q)
System.exit(0);
