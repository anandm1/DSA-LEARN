/**
 * 
 */
package com.anand.basic.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author U45999
 *
 */
public class RandomizeCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> listOfIntegers = new ArrayList<Integer>();
		for(int i =0;i<20;++i){
			listOfIntegers.add(i);
		}
		System.out.println(listOfIntegers);
		Collections.shuffle(listOfIntegers);
		System.out.println(listOfIntegers);
		Collections.rotate(listOfIntegers,1);
		System.out.println(listOfIntegers);
		Collections.sort(listOfIntegers);
		System.out.println(Collections.binarySearch(listOfIntegers, 15));
		
	}

}
