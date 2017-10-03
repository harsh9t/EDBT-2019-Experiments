import glob
import os
import random
vmap = {
	'neo4j' : 'Neo4jGraph',
	'tinkergraph' : 'TinkerGraph',
	'sparksee' : 'SparkseeGraph'
}

dmap = {
	'nwq' : '/home/yashwant/edb/data/northwind.graphml',
	'bsbmq' : '/home/yashwant/edb/data/bsbm.graphml'
}


def get_file_name(path):
	return path.strip().split("/")[-1]

def clear_folder(path):
	all_files = glob.glob(path + "/*")
	for each in all_files:
		os.remove(each)

def create_query(query, graph, dataset, path):
	f = open(path + ".groovy" , "w")
	f.write(""" import com.tinkerpop.blueprints.impls.sparksee.*;
s = new %s("/tmp/%s");
s.loadGraphML("%s");
q = System.currentTimeMillis();
tt = %s
println (System.currentTimeMillis() - q)
""" %(dmap[dataset], str(random.randint(0,1000000000)), dmap[dataset], query))
	f.close()

def create_query_for_tinker3(query, dataset, path):
	f = open(path + ".groovy" , "w")
	"""t = System.currentTimeMillis()
x = TinkerGraph.open();
s = System.currentTimeMillis()
x.io(graphml()).readGraph(args[1])
println System.currentTimeMillis() - s
x.shutdown()"""
	f.write("""
x = TinkerGraph.open();
x.io(gryo()).readGraph("%s");
g = x.traversal();
q = System.currentTimeMillis();
tt = %s
println (System.currentTimeMillis() - q)
""" %("/home/yashwant/edb/data/northwind.kryo", query))
	f.close()

def create_queries(dataset_location):
	all_queries = glob.glob(dataset_location+"/gremlin2_raw/*")
	for each in ['neo4j', 'sparksee', 'tinkergraph']:
		try:
			os.mkdir(dataset_location + '/%s' % (each))
		except Exception as e:
			clear_folder(dataset_location + '/%s' % (each))
		for query in all_queries:
			create_query(open(query).read(), each, dataset_location.strip().split("/")[-1], dataset_location + '/%s/%s' % (each, get_file_name(query)))
	
def create_queries_3(dataset_location):
	try:
		os.mkdir(dataset_location + '/tinker3')
	except Exception as e:
		clear_folder(dataset_location + '/tinker3')
	tinker3_queries = glob.glob(dataset_location+"/gremlin3_raw/*")
	for query in tinker3_queries:
		create_query_for_tinker3(open(query).read(), dataset_location.strip().split("/")[-1], dataset_location + '/tinker3/%s' % (get_file_name(query)));

if __name__ == "__main__":
	create_queries(os.getcwd() + "/nwq")
	create_queries(os.getcwd() + "/bsbmq")
	create_queries_3(os.getcwd() + "/nwq")
	create_queries_3(os.getcwd() + "/bsbmq")	