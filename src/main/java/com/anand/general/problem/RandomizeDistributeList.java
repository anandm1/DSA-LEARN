/**
 * 
 */
package com.anand.general.problem;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author U45999
 *
 */
public class RandomizeDistributeList {
	public static void main(String[] args) {
		List<Integer> listOfIntegers = new ArrayList<Integer>();
		Random r = new Random();
		int totalNumOfElement = 1000000;
		for(int i=0;i<totalNumOfElement;++i){
			// returns random number between 0 and totalNumOfElement, can contain duplicate
			int i5 = r.nextInt(totalNumOfElement); 
			listOfIntegers.add(i5);
		}
		NumberFormat formatter = new DecimalFormat("#0.00000");
		long startTime=0,endTime=0;
		startTime = System.currentTimeMillis();
		int percentage =90;
		divideList(listOfIntegers,percentage);
		endTime   = System.currentTimeMillis();
		System.out.println("Execution Time:: "+
		formatter.format((endTime - startTime) / 1000d) + " seconds");
	}
	
	private static void divideList(List<Integer> listOfIntegers,int percentage){
		int size = listOfIntegers.size();int numOfElementInFirstList = (size*percentage)/100;
		List<Integer> listOfIntegersInFirstList = new ArrayList<Integer>();
		List<Integer> listOfIntegersInSecondList = new ArrayList<Integer>();
		SortedSet<Integer> firstRandomInexes = listOfUniqRandomNumber(numOfElementInFirstList,size);
		Iterator<Integer> it = firstRandomInexes.iterator();
		while(it.hasNext()){
			int num = it.next();
			listOfIntegersInFirstList.add(listOfIntegers.get(num));
		}
		int prevIndexNum=-1;
		Iterator<Integer> itr = firstRandomInexes.iterator();
		while(itr.hasNext()){
			if(prevIndexNum<0){
				prevIndexNum=itr.next();
			}
			int currIndexNum = itr.next();
			while(prevIndexNum<(currIndexNum-1)){
				int leftOutIndx=currIndexNum-prevIndexNum;
				listOfIntegersInSecondList.add(listOfIntegers.get(leftOutIndx));
				prevIndexNum++;
			} //2 5 -- 3+1 // 3 5 -- 2+1 // 4 5 -- 
			prevIndexNum=currIndexNum;
		}
		
		System.out.println("First List Size ="+listOfIntegersInFirstList.size()+ 
				" Second list Size = "+listOfIntegersInSecondList.size());
	}

	private static SortedSet<Integer> listOfUniqRandomNumber(int numOfRandomNumber,int upperbound){
		Random rand = new Random();
        int e;int i; int g = numOfRandomNumber;
        SortedSet<Integer> randomNumbers = new TreeSet<Integer>();
        for (i = 0; i < g; i++) {
            e = rand.nextInt(upperbound);
            if (randomNumbers.size() <= numOfRandomNumber) {
                if (randomNumbers.size() == numOfRandomNumber) {
                    g = numOfRandomNumber;
                }
                g++;
                randomNumbers.add(e);
            }
        }
       /* System.out.println(numOfRandomNumber +" Unique random numbers from "+0+" "
        		+ "to "+upperbound+" are  : " + randomNumbers);*/
        return randomNumbers;
    }
	
	private static HashSet<Integer> listOfUniqRandomNumber(int numOfRandomNumber,int upperbound,
			List<Integer> alreadyContainList){
		Random rand = new Random();
        int e; int i; int g = numOfRandomNumber;
        HashSet<Integer> randomNumbers = new HashSet<Integer>();
        for (i = 0; i < g;) {
            e = rand.nextInt(upperbound);
            if(!alreadyContainList.contains(e)){
	            if (randomNumbers.size() < numOfRandomNumber) {
	                if (randomNumbers.size() == numOfRandomNumber) {
	                    g = numOfRandomNumber;
	                }
	                g++;
	                randomNumbers.add(e);
	            }
	            i++;
            }
        }
       /* System.out.println(numOfRandomNumber +" Unique random numbers from "+0+" to "+upperbound+" "
        		+ "which are not in "+alreadyContainList+"  : " + randomNumbers);*/
        return randomNumbers;
    }

}
