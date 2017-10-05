
x = TinkerGraph.open();
x.io(gryo()).readGraph("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().union(match(__.as('a').has("type","vendor").as('b'),__.as('b').has("country","RU")),match(__.as('a').has("type","vendor").as('b'),__.as('b').has("country","GB"))).select('b')
println (System.currentTimeMillis() - q)
