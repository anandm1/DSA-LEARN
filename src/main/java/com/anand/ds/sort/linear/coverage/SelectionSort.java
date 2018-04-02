/**
 * 
 */
package com.anand.ds.sort.linear.coverage;

import java.sql.Array;
import java.util.Arrays;

import com.anand.ds.sort.recurrence.SortUtil;

/**
 * @author u45999
 *
 */
public class SelectionSort {
	
	public void selectionSort(int[] A, int start , int end){
		Arrays.sort(A);
		for(int i=0;i<=end-1;++i){
			SortUtil.printArray("Iterations ",A,start,end);
			int minIndex=i;
			for(int j=i+1;j<=end;++j){
				if(A[j]<A[minIndex]){
					minIndex=j;
				}
			}
			System.out.println("MININDEX == "+minIndex);
			//Swap minindex
			if(i!=minIndex){
				int temp=A[i];
				A[i]=A[minIndex];
				A[minIndex]=temp;
			}
		}
	}

}
