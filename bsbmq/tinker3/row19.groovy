
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().has("Rating_1").values("Rating_1").order().by(decr).limit(1)
println (System.currentTimeMillis() - q)
