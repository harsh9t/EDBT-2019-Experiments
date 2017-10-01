 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/northwind.graphml("/tmp/432092752");
s.loadGraphML("/home/yashwant/edb/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "product").filter{it.unitsInStock<10 || (it.unitsInStock>10 && it.unitsInStock<20)}.map()
println (System.currentTimeMillis() - q)
