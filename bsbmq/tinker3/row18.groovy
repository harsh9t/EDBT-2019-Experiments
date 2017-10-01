
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().has("type","offer").has("price").values("price").order().by(incr).limit(1)
println (System.currentTimeMillis() - q)
