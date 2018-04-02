/**
 * 
 */
package com.anand.general.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author U45999
 *
 */
public class IterationProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		iterationSecondAlgo();
	}
	
	static void iterationFirstAlgo(){
		int recInterval = 500;
		int numOfRecords = 2499;
		int top = -1;
		int skip = 0;
		while (numOfRecords > 0) {
			if (numOfRecords < recInterval) {
				top = numOfRecords;
			} else {
				top = recInterval;
			}
			// add Record
			System.out.println("NumOfRecords=" + numOfRecords + " Top=" + top + " Skip=" + skip);
			numOfRecords = numOfRecords - top;
			skip = skip + top;
		}

	}
	static void iterationSecondAlgo(){
		int numOfRecords=20001;
		int skippedRecord=0,recordIntervl=500;
		String filter = null;
		List<String> filters = new ArrayList<String>();
		
		while(numOfRecords>0){
			if(numOfRecords<recordIntervl){
				filter = "?$top="+numOfRecords+"&$skip="+skippedRecord;
				skippedRecord=skippedRecord+recordIntervl;numOfRecords = numOfRecords-numOfRecords;
			}else{
				filter = "?$top="+recordIntervl+"&$skip="+skippedRecord;
				skippedRecord=skippedRecord+recordIntervl;numOfRecords = numOfRecords-recordIntervl;
			}
			filters.add(filter);
		}
		System.out.println(filters);
	}

}
