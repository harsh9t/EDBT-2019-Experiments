 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new Neo4jGraph("/tmp/389805038");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "order").as('a').out().has("labelV", "product").as('b').out().has("categoryName", "Beverages").select()
println (System.currentTimeMillis() - q)
System.exit(0);
