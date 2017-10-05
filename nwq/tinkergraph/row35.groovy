 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/124555293");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "product").filter{it.unitPrice>=4.0f && it.unitPrice<7.0f}.map()
println (System.currentTimeMillis() - q)
System.exit(0);
