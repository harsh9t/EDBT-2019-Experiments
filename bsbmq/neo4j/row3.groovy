 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new Neo4jGraph("/tmp/582639011");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
s.createIndex("productID", Vertex.class)
s.createIndex("label_n", Vertex.class)
s.createIndex("type", Vertex.class)
s.createIndex("productTypeID", Vertex.class)
s.createIndex("reviewerID", Vertex.class)

for(i in 1..10) {
	q = System.currentTimeMillis();
	tt = s.V().has("type", "review").outE().inV().productID.dedup.count()
	println (System.currentTimeMillis() - q)
}
System.exit(0);
