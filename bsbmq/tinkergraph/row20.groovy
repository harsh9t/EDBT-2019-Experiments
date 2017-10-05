 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/339291796");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "product_type").filter{it.productTypeID==58 || it.productTypeID == 102}.out()[0..9].label_n
println (System.currentTimeMillis() - q)
System.exit(0);
