 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new Neo4jGraph("/tmp/931641601");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "product").has("ProductPropertyNumeric_1", 1).filter{it.ProductPropertyNumeric_2>100}.map("productID")
println (System.currentTimeMillis() - q)
System.exit(0);
