/**
 * 
 */
package com.anand.codility.problem;

/**
 * @author u45999
 *
 */
public class BinaryGap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryGap bg = new BinaryGap();
		System.out.println(bg.findBinaryGap(1041));

	}
	
	private int findBinaryGap(int N){
		int firstOne=-1,secondOne=-1,binGap=-1,max=0;
		String binRepr = Integer.toBinaryString(N);
		char [] arr = binRepr.toCharArray();
		for(int i=0;i<arr.length;++i){
			if(arr[i]=='1'){
				if(firstOne>=0){
					secondOne=i;
				}
				if(secondOne>0){
					binGap=(secondOne-firstOne)-1;
					
					if(max<=0){
						max=binGap;
					}else if(binGap>max){
						max=binGap;
					}
				}
				firstOne=i;
			}
		}
		return max;
	}

}
