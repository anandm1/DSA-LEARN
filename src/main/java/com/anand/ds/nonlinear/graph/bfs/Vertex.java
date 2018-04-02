/**
 * 
 */
package com.anand.ds.nonlinear.graph.bfs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author U45999
 *
 */
public class Vertex {
	private int data;
	private boolean visited;
	private List<Vertex> neighbourList;
	public Vertex(int data) {
		super();
		this.data = data;
		this.neighbourList = new ArrayList<Vertex>();
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
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
	@Override
	public String toString() {
		return "Vertex [data=" + data + ", visited=" + visited + ", neighbourList=" + neighbourList + "]";
	}
	
	public void addNeighbourVertex(Vertex vertex){
		this.neighbourList.add(vertex);
	}
	
}
