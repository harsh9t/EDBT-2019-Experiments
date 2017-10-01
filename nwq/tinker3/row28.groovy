
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match( __.as('a').out('inCategory').as('c'), __.as('a').values('name').as('b'), __.as('a').values('unitsInStock').as('c')).select('c').groupCount().order().by(incr).limit(3)
println (System.currentTimeMillis() - q)
