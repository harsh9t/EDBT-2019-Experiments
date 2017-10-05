
x = TinkerGraph.open();
x.io(gryo()).readGraph("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().has("type","review").out().has("type","product").values("productID").groupCount().order(local).by(values, decr).limit(local,10)
println (System.currentTimeMillis() - q)
