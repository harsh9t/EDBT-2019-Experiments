
x = TinkerGraph.open();
x.io(gryo()).readGraph("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().union( match( __.as('x').has("customerId", "ALFKI").values('phone').as('a'), __.as('x').has("customerId", "ALFKI").values('name').as('name')), match( __.as('x').has("customerId", "ANTON").values('phone').as('a'), __.as('x').has("customerId", "ANTON").values('name').as('name'))).select('name','a')
println (System.currentTimeMillis() - q)
