
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match( __.as('a').has('productID',343).values('ProductPropertyTextual_1').as('b')).select('b')
println (System.currentTimeMillis() - q)
