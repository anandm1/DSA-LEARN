/**
 * 
 */
package com.anand.design.pattern.singleton;

/**
 * @author U45999
 *
 */
public class Singleton {
	private static Singleton uniqueInstance;
	//Other Useful instances here
	private Singleton(){}
	
	public static Singleton getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	//Other Useful methods here
}
