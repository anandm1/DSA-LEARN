/**
 * 
 */
package com.anand.codility.problem;

import java.util.Scanner;

/**
 * @author U45999
 *
 */
public class FindPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindPalindrome findPalindrome = new FindPalindrome();
		System.out.println("Enter the String (a Word)");
		Scanner scan = new Scanner(System.in);
		
		if(findPalindrome.Solution(scan.nextLine())==1){
			System.out.println("Input String is Palindrome");
		}else{
			System.out.println("Input String is NOT Palindrome");
		}

	}
	
	private int Solution(String T){
		char[] palinArray = T.toCharArray();
		int isPalinDrome = 1;
		int len = palinArray.length;
		for(int i=0;i<=(len/2);++i){
			System.out.println(" "+palinArray[i]+" :: "+palinArray[len-1]);
			if(palinArray[i]!=palinArray[len-1]){
				isPalinDrome = 0;
			}
			len--;
		}
		return isPalinDrome;
	}

}
