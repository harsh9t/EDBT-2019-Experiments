 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new Neo4jGraph("/tmp/489705091");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "product").order{it.a.unitPrice <=> it.b.unitPrice}[5..9].map("productName", "unitPrice")
println (System.currentTimeMillis() - q)
System.exit(0);
