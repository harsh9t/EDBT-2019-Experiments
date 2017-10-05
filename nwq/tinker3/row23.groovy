
x = TinkerGraph.open();
x.io(gryo()).readGraph("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().union( match( __.as('a').values('name').as('name'), __.as('a').values('unitsInStock').is(lt(10)).as('unitsInStock')), match( __.as('a').values('name').as('name'), __.as('a').values('unitsInStock').is(between(10,20)).as('unitsInStock'))).select('name','unitsInStock')
println (System.currentTimeMillis() - q)
