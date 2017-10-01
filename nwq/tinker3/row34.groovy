
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match( __.as('a').hasLabel('customer'), __.as('a').out('ordered').as('order')).select('a').groupCount()
println (System.currentTimeMillis() - q)
