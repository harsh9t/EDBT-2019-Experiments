 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new SparkseeGraph("/tmp/125327337");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("productName").groupBy{it.unitsOnOrder}{it.unitsOnOrder}.cap
println (System.currentTimeMillis() - q)
System.exit(0);
