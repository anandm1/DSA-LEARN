/**
 * 
 */
package com.anand.ds.queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author U45999
 *
 */
public class QueueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		dequeTest();

	}
	
	public static void dequeTest(){
		System.out.println("Inside Deque Test");
		Deque<Integer> dequeInt = new ArrayDeque<Integer>();//Deque<Integer> dequeInt = new LinkedList<Integer>();
		//QUeue - FIFO
		dequeInt.add(1);
		dequeInt.add(10);
		dequeInt.add(12);
		System.out.println(dequeInt.size());
		int size = dequeInt.size();
		for(int i=0;i<size;++i){
			System.out.println("i :: "+i+":: "+dequeInt.remove());
		}
		
		//QUeue - LIFO
		dequeInt.push(10);
		dequeInt.push(100);
		dequeInt.push(120);
		size = dequeInt.size();
		for(int i=0;i<size;++i){
			System.out.println("i :: "+i+":: "+dequeInt.pop());
		}
		
	}

}
