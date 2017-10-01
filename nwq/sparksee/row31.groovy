 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/northwind.graphml("/tmp/360644756");
s.loadGraphML("/home/yashwant/edb/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "category").has("categoryName", "Beverages").in()[0].as('a').in().map().as('b').select()
println (System.currentTimeMillis() - q)
