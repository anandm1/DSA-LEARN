/**
 * 
 */
package com.anand.codility.problem;

/**
 * @author U45999
 *
 */
public class BubbleSortExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private void swapwithoutTemp(int i,int j,int[] array){
		array[i]=array[i]+array[j];
		array[j]=array[i]-array[j];
		array[i]=array[i]+array[j];
	}

}
