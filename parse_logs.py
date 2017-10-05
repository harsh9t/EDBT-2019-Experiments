import glob, os

def parse_a_file(content):
	l = []
	for each in content:
		try:
			l.append(int(each.strip()))
		except Exception as e:
			pass
	return sum(l)/len(l)

def return_name(l):
	print(l.strip().split("/")[-1].split(".")[0])
	return l.strip().split("/")[-1].split(".")[0]

def get_proper_name(n, map):
	return map[n]

def create_map():
	nwq = {}
	bsbmq = {}
	f = open("nw_map", "r").readlines()
	for each in f:
		nwq[each.strip().split(" : ")[0]] = each.strip().split(" : ")[1]

	f = open("bsbm_map", "r").readlines()
	for each in f:
		bsbmq[each.strip().split(" : ")[0]] = each.strip().split(" : ")[1]

	return nwq, bsbmq

def write_to_file(dic, m, filename):
	f = open(filename, 'w')
	for each in dic:
		f.write("%s,%s\n" %( m[each], str(dic[each])))
	f.close()

def parser(nwq, bsbmq):
	all_datasets = glob.glob(os.getcwd() + "/logs/*")
	for each in all_datasets:
		all_graphs = glob.glob(each + "/*")
		for graph in all_graphs:
			all_queries = glob.glob(graph + "/*")
			query_parsed = parse_a_config(each, graph, all_queries)
			x = nwq if "nw" in each else bsbmq  
			write_to_file(query_parsed, x, os.getcwd() + "/consolidated_logs/" + return_name(each) + "_" + return_name(graph))


def parse_a_config(dataset, graph, all_queries):
	dic = {}
	for query in all_queries:
		dic[return_name(query)] = parse_a_file(open(query, "r").readlines())
	return dic



if __name__ == "__main__":
	try:
		os.mkdir(os.getcwd() + "/consolidated_logs")
	except Exception as e:
		pass
	nwq, bsbmq = create_map()
	parser(nwq, bsbmq)
