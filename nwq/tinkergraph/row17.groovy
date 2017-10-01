 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/northwind.graphml("/tmp/359368535");
s.loadGraphML("/home/yashwant/edb/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "order").outE().has("labelE", "orderedBy").inV().groupCount{it.customerID}.cap
println (System.currentTimeMillis() - q)
