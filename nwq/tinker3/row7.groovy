
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match( __.as('a').has('product','unitPrice',between(5,10)).as('b')).valueMap('name','unitPrice')
println (System.currentTimeMillis() - q)
