 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new SparkseeGraph("/tmp/703809594");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
s.createKeyIndex("name", Vertex.class)
s.createKeyIndex("customerId", Vertex.class)
s.createKeyIndex("unitPrice", Vertex.class)
s.createKeyIndex("unitsInStock", Vertex.class)
s.createKeyIndex("unitsOnOrder", Vertex.class)

for(i in 1..10) {
	q = System.currentTimeMillis();
	tt = s.V().has("productName").groupBy{it.unitsInStock}{it.unitsInStock}.cap
	println (System.currentTimeMillis() - q)
}
System.exit(0);
