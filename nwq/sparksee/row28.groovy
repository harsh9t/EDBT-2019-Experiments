 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/northwind.graphml("/tmp/968656865");
s.loadGraphML("/home/yashwant/edb/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "product").groupCount{it.unitsInStock}.cap
println (System.currentTimeMillis() - q)
