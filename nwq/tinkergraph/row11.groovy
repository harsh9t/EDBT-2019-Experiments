 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/854709569");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
s.createIndex("name", Vertex.class)
s.createIndex("customerId", Vertex.class)
s.createIndex("unitPrice", Vertex.class)
s.createIndex("unitsInStock", Vertex.class)
s.createIndex("unitsOnOrder", Vertex.class)

for(i in 1..10) {
	q = System.currentTimeMillis();
	tt = s.V().has("unitsOnOrder",0)[0..4].map("productName", "unitsOnOrder")
	println (System.currentTimeMillis() - q)
}
System.exit(0);
