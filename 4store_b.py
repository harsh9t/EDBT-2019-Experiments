import glob, subprocess, time, random

def import_file(location, name):
	subprocess.call("4s-backend-setup --node 0 --cluster 1 --segments 4 %s" %(name), shell = True)
	subprocess.call("4s-backend %s" %(name), shell = True)	
	subprocess.call("4s-import %s --format rdfxml %s"% (name, location), shell = True)

def import_file_bsbm(location, name):
	subprocess.call("4s-backend-setup --node 0 --cluster 1 --segments 4 %s" %(name), shell = True)
	subprocess.call("4s-backend %s" %(name), shell = True)	
	subprocess.call("4s-import %s --format ntriples %s"% (name, location), shell = True)

def run_query(query_location, runs, log_file, name):
	f = open(log_file, "w")
	all_ques = glob.glob(query_location + "/*")
	for each in all_ques:
		q = open(each, "r").read()
		for i in range(runs):
			start = time.time()
			subprocess.call('4s-query --soft-limit -1 %s "%s" > temp' % (name, q), shell = True)
			end = time.time()
			c = open("temp", "r").read().lower()
			if "error" in c: 
				f.write(str(each.split("/")[-1]) + "," + str(i) + "," +  str("Error") + "\n")			
			else:
				f.write(str(each.split("/")[-1]) + "," + str(i) + "," +  str(end-start) + "\n")
	f.close()

def stop():
	subprocess.call("pkill -e -c  '4s-backend *'", shell = True)


if __name__ == "__main__":
	name_of_dnb = "demo%d" %(random.randint(0,10000999))
	import_file("/home/yashwant/EDBT-2018-Experiments/Data/rdfs/northwind/northwind.data.v1.rdf", name_of_dnb)
	run_query("/home/yashwant/EDBT-2018-Experiments/4store_queries", 1, "4slog_northwind.log", name_of_dnb)
	stop()
	name_of_dnb = "demo%d" %(random.randint(0,10000999))

	import_file_bsbm("/home/yashwant/Downloads/scale2785_1M.nt", name_of_dnb)
	run_query("/home/yashwant/EDBT-2018-Experiments/4store_queries", 1, "4slog_bsbm.log", name_of_dnb)
	stop()