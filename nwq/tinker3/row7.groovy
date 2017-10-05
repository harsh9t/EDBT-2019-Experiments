
x = TinkerGraph.open();
x.io(gryo()).readGraph("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match( __.as('a').has('product','unitPrice',between(5,10)).as('b')).valueMap('name','unitPrice')
println (System.currentTimeMillis() - q)
