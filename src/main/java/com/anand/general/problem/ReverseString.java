/**
 * 
 */
package com.anand.general.problem;

/**
 * @author U45999
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseString rsString =new ReverseString();
		System.out.println(rsString.reversString("Anand"));

	}
	
	private char[] reversString(String str){
		char[] charArray = str.toCharArray();
		int i=0;
		int len=charArray.length;
		for(int j=len-1;j>=0 && i<(len/2);j--){
			char temp=charArray[j];
			charArray[j]=charArray[i];
			charArray[i]=temp;
			i++;
		}
		System.out.println(charArray);
		return charArray;
	}

}
