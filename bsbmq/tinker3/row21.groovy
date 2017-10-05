
x = TinkerGraph.open();
x.io(gryo()).readGraph("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().union(match(__.as('a').has("productID",343).as('b'),__.as('b').values("label_n").as("label_n"),__.as('b').values("ProductPropertyNumeric_1").as('propertyNumeric1')),match(__.as('a').has("productID",350).as('b'),__.as('b').values("label_n").as("label_n"),__.as('b').values("ProductPropertyNumeric_1").as('propertyNumeric1'))).select("label_n","propertyNumeric1").limit(10)
println (System.currentTimeMillis() - q)
