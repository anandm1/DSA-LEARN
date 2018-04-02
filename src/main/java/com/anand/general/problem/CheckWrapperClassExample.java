/**
 * 
 */
package com.anand.general.problem;

import java.util.HashSet;

/**
 * @author U45999
 *
 */
public class CheckWrapperClassExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*System.out.println(Integer.parseInt("1231"));*/
		CheckWrapperClassExample checkWrapperClassExample = new CheckWrapperClassExample();
		/*double o1 = 1;
		double o2 = 2.0;
		checkWrapperClassExample.method(o1, o2);*/
		HashSet<String> set = new HashSet<String>();
		set.add(new String("a"));
		set.add(new String("b"));
		set.add(new String("c"));
		 
		for(String a: set)
			
			System.out.println(a.valueOf("a"));
	}
	
	void method(Double d,Integer i){
		
	}
	
	void method(Integer i,Double d){
		
	}
	
	void method(String s1,String s2){
		
	}
	
	void method(Object d,Object i){
		System.out.println("Method(object,Object) is invoked"+d+" :: "+i);
	}

}
