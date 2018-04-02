/**
 * 
 */
package com.anand.ds.nonlinear.graph.topologicalorder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author U45999
 *
 */
public class Vertex {
	
	private String data;
	private boolean visited;
	private List<Vertex> neighbourList;
	public Vertex(String data) {
		super();
		this.data = data;
		neighbourList = new ArrayList<Vertex>();
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getNeighbourList() {
		return neighbourList;
	}

	public void setNeighbourList(List<Vertex> neighbourList) {
		this.neighbourList = neighbourList;
	}

	public void addNeighbour(Vertex vertex){
		this.neighbourList.add(vertex);
	}

	@Override
	public String toString() {
		return "Vertex [data=" + data + ", visited=" + visited + ", neighbourList=" + neighbourList + "]";
	}
	

}
