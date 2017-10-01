
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().has("type","product").has("ProductPropertyNumeric_1",1).has("ProductPropertyNumeric_2",gt(100)).values("productID","ProductPropertyNumeric_1","ProductPropertyNumeric_2")
println (System.currentTimeMillis() - q)
