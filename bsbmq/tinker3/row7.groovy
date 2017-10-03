
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().has("type","product").has("ProductPropertyNumeric_1",1).values("productID")
println (System.currentTimeMillis() - q)
