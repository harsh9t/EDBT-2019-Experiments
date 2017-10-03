
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().has("productID").has("label_n").valueMap("productID","label_n").range(0,5)
println (System.currentTimeMillis() - q)
