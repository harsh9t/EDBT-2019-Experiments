 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new SparkseeGraph("/tmp/817674930");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("categoryName","Seafood").inE().outV().groupCount{it.unitPrice}.cap
println (System.currentTimeMillis() - q)
System.exit(0);
