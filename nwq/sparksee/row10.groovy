 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new SparkseeGraph("/tmp/695382750");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("productID").order{it.a.unitPrice <=> it.b.unitPrice}[0..5].map("productName", "unitPrice")
println (System.currentTimeMillis() - q)
System.exit(0);
