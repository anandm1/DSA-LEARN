/**
 * 
 */
package com.anand.ds.sort.recurrence;

import java.util.Scanner;

import com.anand.ds.sort.linear.coverage.SelectionSort;

/**
 * @author u45999
 *
 */
public class RunSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int choice = displayMenu();
		int A[] = new int[]{12,9,7,15,10,30};
		int start=0;
		int end=A.length-1;
		QuickOrMergeSort quickOrMergeSort = null;
		if(choice==1){
			//MERGE SORT
			quickOrMergeSort = new QuickOrMergeSort();
			SortUtil.printArray("INPUT ELEMENTS ARE ",A,start,end);
			quickOrMergeSort.MergeSort(A,start,end);
			SortUtil.printArray("FINAL SORTED ARRAY  ",A,start,end);
		}else if(choice==2){
			//QUICK SORT
			quickOrMergeSort = new QuickOrMergeSort();
			SortUtil.printArray("INPUT ELEMENTS ARE ",A,start,end);
			quickOrMergeSort.QuickSort(A,start,end);
			SortUtil.printArray("FINAL SORTED ARRAY  ",A,start,end);
		}else if(choice==3){
			//QUICK SORT
			SelectionSort selSort = new SelectionSort();
			SortUtil.printArray("INPUT ELEMENTS ARE ",A,start,end);
			selSort.selectionSort(A,start,end);
			SortUtil.printArray("FINAL SORTED ARRAY  ",A,start,end);
		}
	}
	private static int displayMenu(){
		System.out.println("################### WHICH SORT YOU WANT ,  SELECT FROM MENU  - START ########################");
		System.out.println("1. MERGE SORT (SELECT 1)");
		System.out.println("2. QUICK SORT (SELECT 2)");
		System.out.println("3. SELECTION SORT (SELECT 3)");
		System.out.println("################### WHICH SORT YOU WANT ,  SELECT FROM MENU  - END ########################");
		Scanner scan = new Scanner(System.in);
		System.out.print("ENTER YOUR CHOICE ::: ");
		int choice =  scan.nextInt();
		if(choice<0 || choice>3){
			System.out.println("Wrong Input");
		}
		scan.close();
		return choice;
	}

}
