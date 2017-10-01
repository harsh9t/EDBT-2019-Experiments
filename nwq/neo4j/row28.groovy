 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/northwind.graphml("/tmp/850842982");
s.loadGraphML("/home/yashwant/edb/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "product").groupCount{it.unitsInStock}.cap
println (System.currentTimeMillis() - q)
