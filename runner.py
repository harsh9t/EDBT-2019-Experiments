import argparse
import glob
import generator
import os
import subprocess

clear_cache = "ls"
def run_ind_query(path_to_gremlin, query, logfile, warm_cache = False):
	print("%s %s >> %s" % (path_to_gremlin, query, logfile))
	subprocess.call("%s -e %s >> %s" % (path_to_gremlin, query, logfile), shell = True)
	if warm_cache:
		subprocess.call(clear_cache)

def clear_tmp():
	subprocess.call("rm -Rf /tmp/*", shell = True)

if __name__ == "__main__":
	clear_tmp()
	oscwd = os.getcwd()
	parser = argparse.ArgumentParser(description='EDBT Sample Script')
	parser.add_argument('-p2', '--gremlin2-path', required = True)
	parser.add_argument('-p3', '--gremlin3-path', required = True)
	parser.add_argument('-n', '--runs', required = True)
	parser.add_argument('-d', '--dms', required = True)
	parser.add_argument('-ds', '--dataset', required = True)

	args = vars(parser.parse_args())

	g_dms = args['dms'].split(",") 

	os.chdir("/".join(args["gremlin2_path"].split("/")[:-1]))
	print(os.getcwd())
	print(args)
	try:
		os.mkdir(oscwd + "/logs")
	except Exception as e:
		pass

	try:
		os.mkdir(oscwd + "/logs/%s" % (args['dataset']))
	except Exception as e:
		for each in g_dms:
			generator.clear_folder(oscwd + "/logs/%s/%s" % (args["dataset"], each))

	for each in g_dms:
		try:
			os.mkdir(oscwd + "/logs/%s/%s" % (args['dataset'], each))	
		except Exception as e:
			pass
		

	for each in g_dms:
		if each=='tinker3':
			continue
		print("DMS is %s" %(each))
		all_queries = glob.glob(oscwd + "/" + args["dataset"] + ("/%s/*" % (each)))
		print(all_queries)
		for query in all_queries:
			for i in range(int(args["runs"])):
				clear_tmp()
				run_ind_query("./" + args["gremlin2_path"].strip().split("/")[-1], query, oscwd + "/logs/%s/%s/%s" % (args["dataset"], each, generator.get_file_name(query)))


	#Running for tinker3
	print("Reached here")
	os.chdir("/".join(args["gremlin3_path"].split("/")[:-1]))
	all_queries = glob.glob(oscwd + "/" + args["dataset"] + "/tinker3/*" )
	print(oscwd + "/" + args["dataset"] + "/tinker3/*")
	print(all_queries)
	print(os.getcwd())
	print(os.getcwd())
	print(os.getcwd())
	print(os.getcwd())
	print(os.getcwd())
	print(os.getcwd())
	for query in all_queries:
			for i in range(int(args["runs"])):
				clear_tmp()
				run_ind_query("./" + args["gremlin3_path"].strip().split("/")[-1], query, oscwd + "/logs/%s/tinker3/%s" % (args["dataset"], generator.get_file_name(query)))	
