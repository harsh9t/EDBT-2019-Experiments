
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match( __.as('a').hasLabel('product').as('b')).valueMap('name','unitsInStock').limit(5)
println (System.currentTimeMillis() - q)
