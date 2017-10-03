 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/northwind.graphml("/tmp/650614449");
s.loadGraphML("/home/yashwant/edb/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "customer").filter{it.customerID=="ALFKI" || it.customerID=="ANTON"}.map("contactName", "phone")
println (System.currentTimeMillis() - q)
