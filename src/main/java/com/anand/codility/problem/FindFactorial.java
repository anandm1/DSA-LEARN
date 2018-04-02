/**
 * 
 */
package com.anand.codility.problem;

/**
 * @author U45999
 *
 */
public class FindFactorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindFactorial findFact = new FindFactorial();
		System.out.println(findFact.findFactorial(5) );

	}
	
	private int findFactorial(int N){
		if(N<=0)return 0;
		if(N==1) {
			return 1;
		}else{
		return N*findFactorial(N-1);
		}
		
	}

}
