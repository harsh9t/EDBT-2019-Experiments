
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().union( match( __.as('a').values('name').as('name'), __.as('a').values('unitsInStock').is(lt(10)).as('unitsInStock')), match( __.as('a').values('name').as('name'), __.as('a').values('unitsInStock').is(between(10,20)).as('unitsInStock'))).select('name','unitsInStock')
println (System.currentTimeMillis() - q)
