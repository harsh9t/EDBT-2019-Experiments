 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/395937900");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
s.createIndex("productID", Vertex.class)
s.createIndex("label_n", Vertex.class)
s.createIndex("type", Vertex.class)
s.createIndex("productTypeID", Vertex.class)
s.createIndex("reviewerID", Vertex.class)

for(i in 1..10) {
	q = System.currentTimeMillis();
	tt = s.V().has("productID", 343).map()
	println (System.currentTimeMillis() - q)
}
System.exit(0);
