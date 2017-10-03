
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().has("type","reviewer").out().has("type","review").values("Rating_1").groupCount().order(local).by(values, decr).limit(local,10)
println (System.currentTimeMillis() - q)
