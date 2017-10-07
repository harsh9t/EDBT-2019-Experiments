
x = TinkerGraph.open();
x.io(gryo()).readGraph("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.kryo");
x.createIndex("productID", Vertex.class)
x.createIndex("label_n", Vertex.class)
x.createIndex("type", Vertex.class)
x.createIndex("productTypeID", Vertex.class)
x.createIndex("reviewerID", Vertex.class)

g = x.traversal();
for (i in 1..10) {
	q = System.currentTimeMillis();
	tt = g.V().has("type","product").has("ProductPropertyNumeric_1",1).values("productID")
	println (System.currentTimeMillis() - q)
}
