
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
	tt = g.V().union(match(__.as('a').has("productID",343).as('b'),__.as('b').values("label_n").as("label_n"),__.as('b').values("ProductPropertyNumeric_1").as('propertyNumeric1')),match(__.as('a').has("productID",350).as('b'),__.as('b').values("label_n").as("label_n"),__.as('b').values("ProductPropertyNumeric_1").as('propertyNumeric1'))).select("label_n","propertyNumeric1").limit(10)
	println (System.currentTimeMillis() - q)
}
