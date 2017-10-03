 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/bsbm.graphml("/tmp/345009148");
s.loadGraphML("/home/yashwant/edb/data/bsbm.graphml");
q = System.currentTimeMillis();
tt =  s.V().has("type", "review").has("Rating_1").out().has("type", "product").groupCount{it.productID}.cap()
println (System.currentTimeMillis() - q)
