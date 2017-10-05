
x = TinkerGraph.open();
x.io(gryo()).readGraph("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().union(match(__.as('a').has("productTypeID",58),__.as('a').out().values("label_n").as("label_n")),match(__.as('a').has("productTypeID",102),__.as('a').out().values("label_n").as("label_n"))).select("label_n").limit(10)
println (System.currentTimeMillis() - q)
