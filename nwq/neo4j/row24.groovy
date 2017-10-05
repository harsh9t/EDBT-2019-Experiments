 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new Neo4jGraph("/tmp/87754225");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "customer").filter{it.customerID=="ALFKI" || it.customerID=="ANTON"}.map("contactName", "phone")
println (System.currentTimeMillis() - q)
System.exit(0);
