
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match( __.as('a').out('inCategory').as('c'), __.as('c').has('name','Beverages'), __.as('c').values('description').as('dec'), __.as('a').values('name').as('b'), __.as('a').values('unitPrice').as('unitprice'), __.as('a').values('unitsInStock').as('stock'), __.as('a').values('discontinued').as('disco'), __.as('a').values('unitsOnOrder').as('uoa')).select('a','b','c','dec','unitprice','stock','disco','uoa').limit(1)
println (System.currentTimeMillis() - q)
