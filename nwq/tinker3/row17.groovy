
x = TinkerGraph.open();
x.io(gryo()).readGraph("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match( __.as("c").hasLabel("customer"), __.as("c").values("customerId").as("customerId"),__.as("c").out("ordered").count().as("orders")).select("customerId", "orders").limit(5)
println (System.currentTimeMillis() - q)
