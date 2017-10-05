 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/360457554");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "customer").as('a').in().has("labelV", "order").as('b').select()
println (System.currentTimeMillis() - q)
System.exit(0);
