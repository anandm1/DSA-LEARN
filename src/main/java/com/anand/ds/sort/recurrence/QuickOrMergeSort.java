/**
 * 
 */
package com.anand.ds.sort.recurrence;

import java.util.Scanner;

/**
 * @author pursuitanand
 * Implement the Merge sort algorithm from the pseudo code shown in the lectures.
 * Implement the Quick sort algorithm from the pseudo code shown in the lectures.
 *
 */
public class QuickOrMergeSort {

	public void QuickSort(int A[],int start,int end){
		if(start<end){
			int pivot = Partition(A,start,end); // pivot here is index of element after partition
			QuickSort(A,start,pivot-1);
			QuickSort(A,pivot+1,end);
		}
		
	}
	
	private int Partition(int A[],int start , int end){
		SortUtil.printArray("BEFORE PARTITION",A,start,end);
		//pivot chosen last value in array
		int pivotElementValue = A[end];
		int i=start;
		for(int j=start;j<end;++j){
			if(A[j]<=pivotElementValue){
				int temp=A[j];
				A[j]=A[i];
				A[i]=temp;
				i=i+1;
			}
			SortUtil.printArray("Working on PARTITION",A,start,end);
		}
		System.out.println("pivot index== "+i);
		int temp2 = A[i];
		A[i]=A[end];
		A[end]=temp2;
		SortUtil.printArray("AFTER PARTITION",A,start,end);
		return i; // Return Pivot Index
	}
	
	
	public  void MergeSort(int A[],int start , int end){
		SortUtil.printArray("DIVIDING (OR Seperating Array) :: ",A,start,end);
		if(start<end){
			int middle=(start+end)/2;
			System.out.println("MIDDLE == "+middle);
			MergeSort(A,start,middle);
			MergeSort(A,middle+1,end);
			Merge(A,start,middle,end);
		}
	}
	
	private  void Merge(int A[],int start , int middle , int end){
		SortUtil.printArray("BEFORE MERGIING  :: ",A,start,end);
		System.out.println("START :: "+start+" MIDDLE :: "+middle+" END  :: "+end);
		int sizeOfLeftArray = middle-start+1;
		int sizeOfRightArray = end-middle;
		/* create temporary arrays */
		int Left[] = new int[sizeOfLeftArray];
		int Right[] = new int[sizeOfRightArray];
		/* Copy data to temp array Left[]  */
		for(int i=0;i<sizeOfLeftArray;++i){
			Left[i]=A[start+i];
		}
		SortUtil.printArray("LEFT ARRAY  :: ",Left,0,sizeOfLeftArray-1);
		/* Copy data to temp array Right[] */
		for(int j=0;j<sizeOfRightArray;++j){
			Right[j]=A[middle+1+j];
		}
		SortUtil.printArray("RIGHT ARRAY  :: ",Right,0,sizeOfRightArray-1);
		int i=0;int j=0;
		int k=start; // make sure k is initialized to recursively passed lower bound value.
		for(;i<sizeOfLeftArray && j<sizeOfRightArray;k++){
			System.out.println("i="+i+" j="+j+" k="+k);
			if((i<(sizeOfLeftArray)) && (j<(sizeOfRightArray))){
				if( (Left[i] <= Right[j])){
					A[k]=Left[i];
					i=i+1;
				}else {
					A[k]=Right[j];
					j=j+1;
				}
			}
		}
		System.out.println("AFTER LOOP i="+i+" j="+j+" k="+k);
		//After merging , we have to copy rest of left Array
		while(i<sizeOfLeftArray){
			A[k]=Left[i];
			i=i+1;k=k+1;
		}
		//After merging , we have to copy rest of Right Array
		while(j<sizeOfRightArray){
			A[k]=Right[j];
			j=j+1;k=k+1;
		}
		
		SortUtil.printArray("AFTER MERGIING  :: ",A,start,end);
	}
	
	

}
