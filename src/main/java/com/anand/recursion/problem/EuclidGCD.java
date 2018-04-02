/**
 * 
 */
package com.anand.recursion.problem;

/**
 * @author U45999
 *
 */
public class EuclidGCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(EuclidGCD.gcd(80, 50));

	}
	
	private static int gcd(int a , int b){
		if(b==0) return a;
		return gcd(b,a%b);
	}

}
