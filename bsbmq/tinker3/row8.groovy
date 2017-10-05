
x = TinkerGraph.open();
x.io(gryo()).readGraph("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match(__.as('a').has('productID',343).as('prod'), __.as('a').in().values('Rating_1').as('b')).select('b').order().by(decr).limit(2)
println (System.currentTimeMillis() - q)
