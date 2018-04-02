/**
 * 
 */
package com.anand.ds.graph;

import java.util.*;
/**
 * @author u45999
 *
 */
public class GraphAdjacencyList {
	
	private Map<Integer,ArrayList<Integer>> adjListMap;
	
	public GraphAdjacencyList(int numOfvertices){
		adjListMap = new HashMap<Integer,ArrayList<Integer>>();
		for(int i=1;i<=numOfvertices;i++){
			ArrayList<Integer> neighbours = new ArrayList<Integer>();
			//create Empty list of neighbours
			adjListMap.put(i,neighbours);
		}
	}
	
	public void addEdge(int vertice , int negbourVertice){
		if(vertice > adjListMap.size() || negbourVertice >  adjListMap.size() ){
			System.out.println("I am here");
			return;
		}
		(adjListMap.get(vertice)).add(negbourVertice);
		(adjListMap.get(negbourVertice)).add(vertice);
	}
	
	public ArrayList<Integer> getNeigbours(int vertice){
		if(vertice>adjListMap.size()){
			return null;
		}
		return new ArrayList<Integer>(adjListMap.get(vertice));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 1, sourceVertix , destinationVertix;
		System.out.print("ENTER the Number of Vertices and Endges");
		Scanner scan = new Scanner(System.in);
		int number_vertices = scan.nextInt();
		int number_edges = scan.nextInt();
		System.out.println("Number of Vertices =>"+number_vertices+"Number of Edges =>"+number_edges);
		GraphAdjacencyList graphAdjacencyList = new GraphAdjacencyList(number_vertices);
		System.out.println("Enter Edges in format <source> <destination>");
		while(count<=number_edges){
			sourceVertix = scan.nextInt();
			destinationVertix = scan.nextInt();
			System.out.println("SourceVertix =>"+sourceVertix+"DestinationVertix=>"+destinationVertix);
			graphAdjacencyList.addEdge(sourceVertix, destinationVertix);
			count++;
		}
		
		System.out.println("\n The GIVEN Adjancecy List for the graph is ");
		for(int i=1;i<=number_vertices;i++){
			System.out.print(i+" => ");
			ArrayList<Integer> edgeList = graphAdjacencyList.getNeigbours(i);
			if(null!=edgeList){
				for(int j=1;;j++){
					if(j!=edgeList.size()){
						System.out.print(edgeList.get(j-1)+"=> ");
					}else{
						//If Last Neighbour
						System.out.print(edgeList.get(j-1));
						break;
					}
				}
			}else{
				System.out.println("NULL for =>"+i);
			}
			System.out.println();
		}

	}

}
