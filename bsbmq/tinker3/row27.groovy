
x = TinkerGraph.open();
x.io(gryo()).readGraph("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().has("type","product").in().has("type","review").in().values("reviewerID").groupCount().order(local).by(values, decr).limit(local,10)
println (System.currentTimeMillis() - q)
