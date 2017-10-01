
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match( __.as('a').has('unitsInStock',0).as('c')).valueMap('name','unitsInStock')
println (System.currentTimeMillis() - q)
