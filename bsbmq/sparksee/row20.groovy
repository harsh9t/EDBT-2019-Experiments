 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/bsbm.graphml("/tmp/690839003");
s.loadGraphML("/home/yashwant/edb/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "product_type").filter{it.productTypeID==58 || it.productTypeID == 102}.out()[0..9].label_n
println (System.currentTimeMillis() - q)
