
x = TinkerGraph.open();
x.io(gryo()).readGraph("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().has("type","vendor").values("country").groupCount()
println (System.currentTimeMillis() - q)