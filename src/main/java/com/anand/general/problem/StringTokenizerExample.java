/**
 * 
 */
package com.anand.general.problem;

import java.util.StringTokenizer;

/**
 * @author U45999
 *
 */
public class StringTokenizerExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Integer contactID = Integer.valueOf("003C000001hYeIJIA0");
		//System.out.println(contactID);
		String contactId="900381384";
		String[] allData = new String[4];
		StringTokenizer st = new StringTokenizer(contactId, ";");
		for(int i = 0; i< 4;i++)
		{
			if(st.hasMoreTokens())
			    allData[i] = st.nextToken();
		    else
				allData[i] = "" ;
			System.out.println("Split Param ContactId........." +allData[i]);
		}
		System.out.println(allData.length);
		
		StringBuffer id= new StringBuffer();
		
		
        Integer contactID = Integer.valueOf(allData[0]);
        System.out.println(contactID);
        System.out.println(allData[0]);
        System.out.println(allData[1]);
        System.out.println(allData[2]);
        System.out.println(allData[3]);

	}

}
