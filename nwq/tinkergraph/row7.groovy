 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/862619239");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("productName").filter{ it.unitPrice <= 10.00}.map("productName")
println (System.currentTimeMillis() - q)
System.exit(0);
