
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
	tt = g.V().match( __.as('a').has("productTypeID",58), __.as('a').out().as('prod'), __.as('prod').values("productID").as('pid'), __.as('prod').values("label_n").as('label_n')).order().by(select('pid'), incr).by(select('label_n')).limit(5)
	println (System.currentTimeMillis() - q)
}
