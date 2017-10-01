 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/bsbm.graphml("/tmp/915091901");
s.loadGraphML("/home/yashwant/edb/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "product").has("ProductPropertyNumeric_1", 1).filter{it.ProductPropertyNumeric_2>100}.map("productID")
println (System.currentTimeMillis() - q)
