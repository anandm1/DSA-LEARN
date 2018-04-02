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
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v4 = new Vertex("4");
		Vertex v8 = new Vertex("8");
		Vertex v9 = new Vertex("9");
		Vertex v5 = new Vertex("5");
		
		v1.addNeighbour(v2);
		v2.addNeighbour(v4);
		v4.addNeighbour(v8);
		v4.addNeighbour(v9);
		v2.addNeighbour(v5);
		//Below one create Cycle , try commenting below to test
		v5.addNeighbour(v1);
		v9.addNeighbour(v2);
		
		List<Vertex> vertexList = new ArrayList<Vertex>();
		vertexList.add(v1);
		vertexList.add(v2);
		vertexList.add(v4);
		vertexList.add(v8);
		vertexList.add(v9);
		vertexList.add(v5);
		
		CycleDetection cycDet = new CycleDetection();
		cycDet.detectCycle(vertexList);
		

	}

}
