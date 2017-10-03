
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().has("reviewerID",86).out().has("Rating_1").out().values("productID").group().by()
println (System.currentTimeMillis() - q)
