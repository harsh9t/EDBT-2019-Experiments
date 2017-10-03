
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match( __.as('a').has("productTypeID",58), __.as('a').out().as('prod'), __.as('prod').values("productID").as('pid'), __.as('prod').values("label_n").as('label_n')).order().by(select('pid'), incr).by(select('label_n')).limit(5)
println (System.currentTimeMillis() - q)
