
x = TinkerGraph.open();
x.io(gryo()).readGraph("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match( __.as('a').out('inCategory').as('c'), __.as('c').has('name','Beverages'), __.as('a').values('unitsInStock').as('stock')).select('stock').groupCount()
println (System.currentTimeMillis() - q)
