 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/bsbm.graphml("/tmp/879958058");
s.loadGraphML("/home/yashwant/edb/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "vendor").groupCount{it.country}.cap
println (System.currentTimeMillis() - q)
