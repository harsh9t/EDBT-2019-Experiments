
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
	tt = g.V().match( __.as('a').values('name').as('b'), __.as('a').values('unitPrice').as('unitprice')).order().by(select('unitprice'), decr).by(select('b')).limit(5)
	println (System.currentTimeMillis() - q)
}
