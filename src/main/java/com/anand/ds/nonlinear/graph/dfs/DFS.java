package com.anand.ds.nonlinear.graph.dfs;

import java.util.List;
import java.util.Stack;

public class DFS {
	
	private Stack<Vertex> stack;
	
	public DFS() {
		super();
		this.stack = new Stack<>();
	}
	
	

	public void dfs(List<Vertex> vertexList){
		//We need for loop if there are several cluster of graph
		for(Vertex v : vertexList){
			if(!v.isVisited()){
				v.setVisited(true);
				//dfsWithStack(v);
				dfsRecursive(v);
			}
		}
	}
	//OS is going to use STACK , stack memory going to be piled up
	private void dfsRecursive(Vertex vertex){
		System.out.println(vertex);
		for(Vertex v : vertex.getNeighbourList()){
			if(!v.isVisited()){
				v.setVisited(true);
				dfsRecursive(v);
			}
		}
	}
	
	private void dfsWithStack(Vertex root){
		
		this.stack.add(root);
		root.setVisited(true);
		
		while(!stack.isEmpty()){
			Vertex actualVertex = this.stack.pop();
			System.out.println(actualVertex+" ");
			
			for(Vertex v : actualVertex.getNeighbourList()){
				if(!v.isVisited()){
					v.setVisited(true);
					this.stack.push(v);
				}
			}
			
			
		}
		
	}

}
