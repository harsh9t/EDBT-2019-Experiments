
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().hasLabel("product").order().by("unitPrice", incr).range(5, 10).valueMap("name", "unitPrice")
println (System.currentTimeMillis() - q)
