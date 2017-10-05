
x = TinkerGraph.open();
x.io(gryo()).readGraph("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match(__.as('a').has("reviewerID",424).as('b'), __.as('b').out().as('c'), __.as('c').values('Rating_1').as('rating1'), __.as('c').values('Rating_2').as('rating2'), __.as('c').values('Rating_3').as('rating3'), __.as('c').values('Rating_4').as('rating4')).select('rating1','rating2','rating3','rating4').limit(5)
println (System.currentTimeMillis() - q)
