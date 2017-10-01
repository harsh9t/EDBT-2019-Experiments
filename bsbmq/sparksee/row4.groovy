 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/bsbm.graphml("/tmp/882265412");
s.loadGraphML("/home/yashwant/edb/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("productID", 343).map("label_n")
println (System.currentTimeMillis() - q)
