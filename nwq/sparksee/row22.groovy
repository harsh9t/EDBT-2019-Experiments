 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new SparkseeGraph("/tmp/658164857");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "product").filter{it.unitsPrice<4 || (it.unitPrice>4 && it.unitPrice<7)}.map()
println (System.currentTimeMillis() - q)
System.exit(0);
