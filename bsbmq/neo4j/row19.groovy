 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new Neo4jGraph("/tmp/100154555");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "review").Rating_1.max()
println (System.currentTimeMillis() - q)
System.exit(0);
