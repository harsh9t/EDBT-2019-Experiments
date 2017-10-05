 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new SparkseeGraph("/tmp/415801871");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "product").order{it.b.unitsInStock <=> it.a.unitsInStock}[0..4].map("productName", "unitsInStock")
println (System.currentTimeMillis() - q)
System.exit(0);
