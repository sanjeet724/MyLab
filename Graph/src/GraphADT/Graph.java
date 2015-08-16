package GraphADT;

import java.util.ArrayList;
import java.util.TreeMap;

class Graph {
	private int numOfvertices;
	private int numEdges;
	
	private ArrayList<TreeMap<Integer, Integer>> adjList;
	
	//private Vector<TreeMap<Integer, Integer>> adjList;
	//ArrayList is preferred over vectors
	
	public Graph (int n) {
		numOfvertices = n;
		numEdges = 0;
		adjList = new ArrayList<TreeMap<Integer,Integer>>();
		for (int i=0;i<numOfvertices;i++){
			adjList.add(new TreeMap<Integer, Integer>());
		}
	}
	
	public int getNumVertices(){
		return numOfvertices;
	}
	
	public int getNumEdges(){
		return numEdges;
	}
	
	public int getEdgeWeight(Integer v, Integer w){
		if (adjList.get(v).get(w) == null ){
			System.out.println("No Edge Found");
			return 0;
		}
		return adjList.get(v).get(w);
	}
	
	/* adds an edge from v to w to the graph and to the adjacency list */
	public void addEdge(Integer v, Integer w, int wgt){
		adjList.get(v).put(w, wgt);
		adjList.get(w).put(v, wgt);
		numEdges++;
	}
	/* creates an edge and adds it to the graph */
	public void addEdge(Edge e){
		Integer v = e.getV();
		Integer w = e.getW();
		int weight = e.getWeight();
		addEdge(v,w,weight);
	}

	/* remove the edge from v's and w's adjacency list */
	public void removeEdge(Edge e){
		Integer v = e.getV();
		Integer w = e.getW();
		adjList.get(v).remove(w);
		adjList.get(w).remove(v);
		numEdges--;
	}
	
	public Edge findEdge(Integer v, Integer w){
		int wgt = this.getEdgeWeight(v, w);
		if (wgt != 0) {
			return new Edge(v, w, wgt);
		}
		return null;
	}
	
	TreeMap<Integer, Integer>getAdjList(Integer v){
		return adjList.get(v);
	}

}
