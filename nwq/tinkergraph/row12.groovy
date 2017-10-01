 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/northwind.graphml("/tmp/712724977");
s.loadGraphML("/home/yashwant/edb/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("productName").groupBy{it.unitsOnOrder}{it.unitsOnOrder}.cap
println (System.currentTimeMillis() - q)
