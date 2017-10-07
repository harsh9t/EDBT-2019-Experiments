 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new SparkseeGraph("/tmp/437041754");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
s.createKeyIndex("productID", Vertex.class)
s.createKeyIndex("label_n", Vertex.class)
s.createKeyIndex("type", Vertex.class)
s.createKeyIndex("productTypeID", Vertex.class)
s.createKeyIndex("reviewerID", Vertex.class)

for(i in 1..10) {
	q = System.currentTimeMillis();
	tt = s.V().has("type", "product").has("label_n")[0..4].map("productID", "label_n")
	println (System.currentTimeMillis() - q)
}
System.exit(0);
