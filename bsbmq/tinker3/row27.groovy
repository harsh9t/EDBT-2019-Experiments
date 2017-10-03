
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().has("type","product").in().has("type","review").in().values("reviewerID").groupCount().order(local).by(values, decr).limit(local,10)
println (System.currentTimeMillis() - q)
