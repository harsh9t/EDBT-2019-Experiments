
x = TinkerGraph.open();
x.io(gryo()).readGraph("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().has("reviewerID",86).out().has("Rating_1").out().values("productID").group().by()
println (System.currentTimeMillis() - q)
