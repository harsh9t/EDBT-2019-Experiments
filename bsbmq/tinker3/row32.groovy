
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
	tt = g.V().match(__.as('a').has("type","producer").as('b'),__.as('b').values('label_n').as('label_n'),__.as('b').values('comment').as('comment'),__.as('b').values('country').as('country'),__.as('b').values('homepage').as('homepage'),__.as('b').out().has("productID",343).as('c'),__.as('c').out().has("type","offer").as('d').values('price').as('price'),__.as('c').out().has("type","offer").values('OfferWebPage').as('OfferWebPage')).select('b','label_n','comment','country','homepage','c','d','price','OfferWebPage').limit(5)
	println (System.currentTimeMillis() - q)
}
