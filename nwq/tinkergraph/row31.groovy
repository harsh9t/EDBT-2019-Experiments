 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/476003577");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "category").has("categoryName", "Beverages").in()[0].as('a').in().map().as('b').select()
println (System.currentTimeMillis() - q)
System.exit(0);
