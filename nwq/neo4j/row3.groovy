 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new Neo4jGraph("/tmp/786110663");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("productName").map("productName")
println (System.currentTimeMillis() - q)
System.exit(0);
