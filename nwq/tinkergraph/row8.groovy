 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/308212196");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "product").filter{it.unitsInStock !=0}.map()
println (System.currentTimeMillis() - q)
System.exit(0);
