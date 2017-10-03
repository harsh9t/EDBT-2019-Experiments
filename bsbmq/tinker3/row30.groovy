
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match( __.as('a').has("productID",343).as('b').valueMap().as('c'),__.as('b').out().values('label_n').as('label'),__.as('b').in().has('homepage','http://www.Producer8.com/').values('label_n').as('label_prod')).select('c','label','label_prod').limit(1)
println (System.currentTimeMillis() - q)
