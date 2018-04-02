/**
 * 
 */
package com.anand.ds.sort.recurrence;

/**
 * @author u45999
 *
 */
public class SortUtil {
	
	public static void printArray(String message, int inputArray[], int start , int end){
		System.out.print(message+" :: [");
		for( ; start<=end;start++){
			if(start<end){
				System.out.print(inputArray[start]+",");
			}
			else{
				System.out.print(inputArray[start]);
			}
		}
		System.out.print("]");
		System.out.println();
	}

}
