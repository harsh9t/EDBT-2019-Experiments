 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/777031100");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "product").order{it.b.unitPrice <=> it.a.unitPrice}[0..4].map("productName", "unitPrice")
println (System.currentTimeMillis() - q)
System.exit(0);
