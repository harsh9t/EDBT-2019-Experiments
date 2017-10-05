
x = TinkerGraph.open();
x.io(gryo()).readGraph("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().has("price").has("OfferWebPage").valueMap("price","OfferWebPage").range(0,5)
println (System.currentTimeMillis() - q)
