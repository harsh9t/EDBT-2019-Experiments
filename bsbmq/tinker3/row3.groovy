
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match( __.as('a').has("type","review").as('b'), __.as('b').out().has("type","product").as('c')).select('c').dedup().count()

println (System.currentTimeMillis() - q)
