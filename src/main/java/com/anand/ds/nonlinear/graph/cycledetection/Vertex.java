/**
 * 
 */
package com.anand.ds.nonlinear.graph.cycledetection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author U45999
 *
 */
public class Vertex {

	private String name;
	private boolean visited;
	private boolean beingVisited;
	private List<Vertex> adjacencyList;

	public Vertex(String name) {
		this.name = name;
		adjacencyList = new ArrayList<Vertex>();
	}

	

	@Override
	public String toString() {
		return "Vertex [name=" + name + ", visited=" + visited + ", beingVisited=" + beingVisited + "]";
	}



	public void addNeighbour(Vertex vertex) {
		this.adjacencyList.add(vertex);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public boolean isBeingVisited() {
		return beingVisited;
	}

	public void setBeingVisited(boolean beingVisited) {
		this.beingVisited = beingVisited;
	}

	public List<Vertex> getAdjacencyList() {
		return adjacencyList;
	}

	public void setAdjacencyList(List<Vertex> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}

}
