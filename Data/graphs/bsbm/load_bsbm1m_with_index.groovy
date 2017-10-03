class BSBM1M {

  public static Graph createGraph() {
	def newGraph = TinkerGraph.open()
	def file = new File('./bin/bsbm1m.graphml')
	BSBM1M.load(newGraph, file.getAbsolutePath())
	return newGraph
  }

  public static void load(final Graph newGraph, final String path) {
    newGraph.io(IoCore.graphml()).readGraph(path)
    newGraph.createIndex('productID', Vertex.class)
    newGraph.createIndex('label_n', Vertex.class)
    newGraph.createIndex('type', Vertex.class)
    newGraph.createIndex('productTypeID', Vertex.class)
    newGraph.createIndex('reviewerID', Vertex.class)
  }
}
