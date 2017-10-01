 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/northwind.graphml("/tmp/185534932");
s.loadGraphML("/home/yashwant/edb/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "product").filter{it.unitsPrice<4 || (it.unitPrice>4 && it.unitPrice<7)}.map()
println (System.currentTimeMillis() - q)
