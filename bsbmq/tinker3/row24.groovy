
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().or( __.has('productID',343).values('ProductPropertyTextual_1','ProductPropertyTextual_2'), __.has('productID',350).values('ProductPropertyNumeric_1')).values("ProductPropertyTextual_1", "ProductPropertyTextual_2", "ProductPropertyNumeric_1")
println (System.currentTimeMillis() - q)
