package GraphADT;

class Edge {
	private Integer v,w; // the vertices of the edge
	private int weight;  // the weight of the edge 
	
	public Edge(Integer first, Integer second, int edgeweight){
		v = first;
		w = second;
		weight = edgeweight;
	}
	//test
	public int getWeight() {
		return weight;
	}
	
	/* returns the first vertex of the edge */
	public Integer getV(){
		return v;
	}
	
	/* returns the second vertex of the edge */
	public Integer getW(){
		return w;
	}

}
