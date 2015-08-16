package GraphADT;

public class GraphDriver {

	public static void main(String[] args) {
		Graph myGraph = new Graph(4);
		/* creating edges */
		Edge edge_1 = new Edge(0, 3, 6);
		Edge edge_2 = new Edge(0, 1, 8);
		Edge edge_3 = new Edge(1, 2, 9);
		/* adding edges to the graph */
		myGraph.addEdge(edge_1);
		myGraph.addEdge(edge_2);
		myGraph.addEdge(edge_3);
		
//		Object adjlist_0 = myGraph.getAdjList(0);
//		Object adjlist_1 = myGraph.getAdjList(1);
//		Object adjlist_2 = myGraph.getAdjList(2);
//		Object adjlist_3 = myGraph.getAdjList(3);
//		
//		System.out.println("AdjList 0 is " + adjlist_0);
//		System.out.println("AdjList 1 is " + adjlist_1);
//		System.out.println("AdjList 2 is " + adjlist_2);
//		System.out.println("AdjList 3 is " + adjlist_3);
//		
//		Edge check0_1 = myGraph.findEdge(3,2);
//		System.out.println("Edge is  " + check0_1);
		BFSIterator bfs = new BFSIterator(myGraph);
		bfs.startSearch();
	}

}
