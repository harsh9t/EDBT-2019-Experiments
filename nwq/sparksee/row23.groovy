 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new SparkseeGraph("/tmp/399532244");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "product").filter{it.unitsInStock<10 || (it.unitsInStock>10 && it.unitsInStock<20)}.map()
println (System.currentTimeMillis() - q)
System.exit(0);
