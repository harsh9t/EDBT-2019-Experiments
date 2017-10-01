
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match( __.as('a').values('name').as('b'), __.as('a').values('unitPrice').as('unitprice')).order().by(select('unitprice'), decr).by(select('b')).limit(5)
println (System.currentTimeMillis() - q)
