
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match( __.as("c").hasLabel("customer"), __.as("c").values("customerId").as("customerId"),__.as("c").out("ordered").count().as("orders")).select("customerId", "orders").limit(5)
println (System.currentTimeMillis() - q)
