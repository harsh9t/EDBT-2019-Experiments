
x = TinkerGraph.open();
x.io(gryo()).readGraph("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match( __.as('a').has("type","review").as('b'), __.as('b').out().has("type","product").as('c')).select('c').dedup().count()

println (System.currentTimeMillis() - q)
