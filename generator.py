import glob
import os
import random
vmap = {
	'neo4j' : 'Neo4jGraph',
	'tinkergraph' : 'TinkerGraph',
	'sparksee' : 'SparkseeGraph'
}

dmap = {
	'nwq' : '/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.graphml',
	'bsbmq' : '/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml'
}


def get_file_name(path):
	return path.strip().split("/")[-1]

def clear_folder(path):
	all_files = glob.glob(path + "/*")
	for each in all_files:
		os.remove(each)

def create_query(query, graph, dataset, path, index = None):
	indexing_syn = ""
	if index is not None:
		if graph == "sparksee":
			for each in index:
				indexing_syn += 's.createKeyIndex("%s", Vertex.class)\n' %(each);
		else:
			for each in index:
				indexing_syn += 's.createIndex("%s", Vertex.class)\n' %(each);

	f = open(path + ".groovy" , "w")
	f.write(""" import com.tinkerpop.blueprints.impls.sparksee.*;
s = new %s("/tmp/%s");
s.loadGraphML("%s");
%s
q = System.currentTimeMillis();
tt = %s
println (System.currentTimeMillis() - q)
System.exit(0);
""" %(vmap[graph], str(random.randint(0,1000000000)), dmap[dataset], indexing_syn, query))
	f.close()

def create_query_for_tinker3(query, dataset, path, index = None):
	indexing_syn = ""
	if index is not None:
		for each in index:
			indexing_syn += 'x.createIndex("%s", Vertex.class)\n' %(each);

	f = open(path + ".groovy" , "w")
	f.write("""
x = TinkerGraph.open();
x.io(gryo()).readGraph("%s");
%s
g = x.traversal();
q = System.currentTimeMillis();
tt = %s
println (System.currentTimeMillis() - q)
""" %("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.kryo", indexing_syn, query))
	f.close()

def create_queries(dataset_location, index = None):
	all_queries = glob.glob(dataset_location+"/gremlin2_raw/*")
	for each in ['neo4j', 'sparksee', 'tinkergraph']:
		try:
			os.mkdir(dataset_location + '/%s' % (each))
		except Exception as e:
			clear_folder(dataset_location + '/%s' % (each))
		for query in all_queries:
			create_query(open(query).read(), each, dataset_location.strip().split("/")[-1], dataset_location + '/%s/%s' % (each, get_file_name(query)), index)
	
def create_queries_3(dataset_location, index = None):
	try:
		os.mkdir(dataset_location + '/tinker3')
	except Exception as e:
		clear_folder(dataset_location + '/tinker3')
	tinker3_queries = glob.glob(dataset_location+"/gremlin3_raw/*")
	for query in tinker3_queries:
		create_query_for_tinker3(open(query).read(), dataset_location.strip().split("/")[-1], dataset_location + '/tinker3/%s' % (get_file_name(query)), index);

if __name__ == "__main__":
	create_queries(os.getcwd() + "/nwq", ['name', 'customerId', 'unitPrice', 'unitsInStock', 'unitsOnOrder'])
	create_queries(os.getcwd() + "/bsbmq", ["productID", "label_n", "type", "productTypeID", "reviewerID"])
	create_queries_3(os.getcwd() + "/nwq", ['name', 'customerId', 'unitPrice', 'unitsInStock', 'unitsOnOrder'])
	create_queries_3(os.getcwd() + "/bsbmq", ["productID", "label_n", "type", "productTypeID", "reviewerID"])	
