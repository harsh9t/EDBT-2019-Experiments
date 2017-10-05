 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new Neo4jGraph("/tmp/435041983");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "product").order{it.b.unitsOnOrder <=> it.a.unitsOnOrder}[0..4].map("productName", "unitsOnOrder")
println (System.currentTimeMillis() - q)
System.exit(0);
