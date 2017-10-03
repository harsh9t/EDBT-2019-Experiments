 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/northwind.graphml("/tmp/407205170");
s.loadGraphML("/home/yashwant/edb/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "order").as('a').out().has("labelV", "product").as('b').out().has("categoryName", "Beverages").select()
println (System.currentTimeMillis() - q)
