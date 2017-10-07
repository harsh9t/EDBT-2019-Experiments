
x = TinkerGraph.open();
x.io(gryo()).readGraph("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.kryo");
x.createIndex("name", Vertex.class)
x.createIndex("customerId", Vertex.class)
x.createIndex("unitPrice", Vertex.class)
x.createIndex("unitsInStock", Vertex.class)
x.createIndex("unitsOnOrder", Vertex.class)

g = x.traversal();
for (i in 1..10) {
	q = System.currentTimeMillis();
	tt = g.V().match( __.as('a').hasLabel('customer'), __.as('a').out('ordered').as('order')).select('a').groupCount()
	println (System.currentTimeMillis() - q)
}
