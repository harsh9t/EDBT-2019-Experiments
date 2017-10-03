
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match(__.as('a').has('productID',343).as('prod'), __.as('a').in().values('Rating_1').as('b')).select('b').order().by(decr).limit(2)
println (System.currentTimeMillis() - q)
