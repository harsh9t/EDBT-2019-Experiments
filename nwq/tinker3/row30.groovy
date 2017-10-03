
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match( __.as('a').hasLabel('product'), __.as('a').values('name').as('b'), __.as('a').values('unitsOnOrder').as('c')).order().by(select('c'), decr).by(select('b')).limit(10)
println (System.currentTimeMillis() - q)
