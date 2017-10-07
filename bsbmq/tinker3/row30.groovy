
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
	tt = g.V().match( __.as('a').has("productID",343).as('b').valueMap().as('c'),__.as('b').out().values('label_n').as('label'),__.as('b').in().has('homepage','http://www.Producer8.com/').values('label_n').as('label_prod')).select('c','label','label_prod').limit(1)
	println (System.currentTimeMillis() - q)
}
