
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match( __.as('a').values('name').as('name'), __.as('a').values('unitPrice').is(between(4,7)).as('unitPrice')).select('name','unitPrice')
println (System.currentTimeMillis() - q)
