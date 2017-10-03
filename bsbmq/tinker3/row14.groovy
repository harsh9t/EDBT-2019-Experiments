
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().has("type","review").out().values("productID").limit(10).groupCount()
println (System.currentTimeMillis() - q)
