 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/northwind.graphml("/tmp/214695782");
s.loadGraphML("/home/yashwant/edb/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("categoryName","Seafood").inE().outV().groupCount{it.unitPrice}.cap
println (System.currentTimeMillis() - q)
