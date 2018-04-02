/**
 * 
 */
package com.anand.ds.nonlinear.graph.cycledetection;

import java.util.List;

/**
 * @author U45999
 *
 */
public class CycleDetection {
	
	public void detectCycle(List<Vertex> vertexList){
		for(Vertex v: vertexList){
			if(!v.isVisited()){
				dfs(v);
			}
		}
	}

	private void dfs(Vertex vertex){
		System.out.println("DFS on VERTEX "+vertex);
		vertex.setBeingVisited(true);
		for(Vertex v : vertex.getAdjacencyList()){
			System.out.println("Visiting the neighbour of Vertex  "+vertex);
			if(v.isBeingVisited()){
				System.out.println("There is Backward Edge , thus THERE IS CyCLE!!!");
				return;
			}
			if(!v.isVisited()){
				System.out.println("Visiting Vertex Recursively "+v+" Recursively");
				v.setVisited(true);
				dfs(v);
			}
		}
		System.out.println("Set Vertex "+vertex+" SetBeingVisited(false) and setVisited(true) ");
		vertex.setVisited(true);
		vertex.setBeingVisited(false);
	}
	
}
