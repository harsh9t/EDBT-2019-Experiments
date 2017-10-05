 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new Neo4jGraph("/tmp/590039291");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("productID").order{it.a.unitPrice <=> it.b.unitPrice}[0..5].map("productName", "unitPrice")
println (System.currentTimeMillis() - q)
System.exit(0);
