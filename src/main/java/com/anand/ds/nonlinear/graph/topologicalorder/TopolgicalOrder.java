/**
 * 
 */
package com.anand.ds.nonlinear.graph.topologicalorder;

import java.util.Stack;

/**
 * @author U45999
 * Heavily Realize on dFS
 */
public class TopolgicalOrder {
	
	private Stack<Vertex> stack;
	
	public TopolgicalOrder() {
		this.stack = new Stack<Vertex>();
	}
	
	public void dfs(Vertex vertex){
		vertex.setVisited(true);
		for(Vertex v : vertex.getNeighbourList()){
			if(!v.isVisited()){
				dfs(v);
			}
		}
		stack.push(vertex);
	}
	
	public Stack<Vertex> getStack(){
		return this.stack;
	}

}
