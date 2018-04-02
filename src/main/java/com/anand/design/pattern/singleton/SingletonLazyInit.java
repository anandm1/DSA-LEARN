/**
 * 
 */
package com.anand.design.pattern.singleton;

/**
 * @author U45999
 *
 */
public class SingletonLazyInit {
	private static SingletonLazyInit uniqueInstance;
	//Other Useful instances here
	private SingletonLazyInit(){}
	//Synchronizing method can decrease performance by factor of 100
	//Use if there are no performance concern
	//high traffic approach the below code then use Synchronize 
	public static synchronized SingletonLazyInit getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new SingletonLazyInit();
		}
		return uniqueInstance;
	}
	//Other Useful methods here
}
