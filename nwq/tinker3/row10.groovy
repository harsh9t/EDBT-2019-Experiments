
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().hasLabel("product").order().by("unitPrice", incr).valueMap("name", "unitPrice").limit(5)
println (System.currentTimeMillis() - q)
