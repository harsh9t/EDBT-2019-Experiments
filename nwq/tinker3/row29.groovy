
x = TinkerGraph.open();
x.io(gryo()).readGraph("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().hasLabel("product").order().by("unitPrice", incr).range(5, 10).valueMap("name", "unitPrice")
println (System.currentTimeMillis() - q)
