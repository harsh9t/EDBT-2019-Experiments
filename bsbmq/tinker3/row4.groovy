
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match( __.as('a').has("productID",343).as('b'), __.as('b').values("label_n").as('label')).select('label')
println (System.currentTimeMillis() - q)
