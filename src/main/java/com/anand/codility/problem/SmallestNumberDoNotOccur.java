/**
 * 
 */
package com.anand.codility.problem;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author U45999
 * Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

For another example, given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Assume that:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
Complexity:

 *expected worst-case time complexity is O(N);
 *expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 *Elements of input arrays can be modified.
 *
 */
public class SmallestNumberDoNotOccur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmallestNumberDoNotOccur sd = new SmallestNumberDoNotOccur();
		//int [] A = {1, 3, 6, 4, 1, 2};
		//int [] A = {1, 2,3};
		int [] A = {-1,-3};
		System.out.println(A.length);
		System.out.println(sd.solution(A));

	}
	
	public int solution(int[] A) {
		
		Set<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<A.length;++i){
			set.add(A[i]);
		}
	
		System.out.println(set);
		int count =0,minm=0;
		Iterator<Integer> it =set.iterator();
		while(it.hasNext()){
			int value = it.next();
			if(value<0){
				
			}else if(value >= 0 && count==0){
				count = value;
			}else if (value >= 0 && count!=0){
				if(value==(count+1)){
					count++;
				}else{
					minm = count+1;return minm;
				}
			}
		}
		
		return count+1;
       
    }

}
