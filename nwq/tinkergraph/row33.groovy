 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/195603818");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
s.createIndex("name", Vertex.class)
s.createIndex("customerId", Vertex.class)
s.createIndex("unitPrice", Vertex.class)
s.createIndex("unitsInStock", Vertex.class)
s.createIndex("unitsOnOrder", Vertex.class)

for(i in 1..10) {
	q = System.currentTimeMillis();
	tt = s.V().has("labelV", "customer").has("customerID", "ALFKI").inE().outV().map()
	println (System.currentTimeMillis() - q)
}
System.exit(0);
