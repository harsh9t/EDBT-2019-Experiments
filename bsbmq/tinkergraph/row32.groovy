 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/bsbm.graphml("/tmp/642264483");
s.loadGraphML("/home/yashwant/edb/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "product").has("productID", 343).as('a').both().filter{it.type == "offer" || it.type == "producer"}map().as('b').select()
println (System.currentTimeMillis() - q)
