 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new SparkseeGraph("/tmp/33520442");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
s.createKeyIndex("productID", Vertex.class)
s.createKeyIndex("label_n", Vertex.class)
s.createKeyIndex("type", Vertex.class)
s.createKeyIndex("productTypeID", Vertex.class)
s.createKeyIndex("reviewerID", Vertex.class)

for(i in 1..10) {
	q = System.currentTimeMillis();
	tt = s.V().has("type", "review").outE().inV().productID.dedup.count()
	println (System.currentTimeMillis() - q)
}
System.exit(0);
