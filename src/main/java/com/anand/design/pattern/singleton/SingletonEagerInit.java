/**
 * 
 */
package com.anand.design.pattern.singleton;

/**
 * @author U45999
 *
 */
public class SingletonEagerInit {
	// This is Thread safe and object create at time of class load
	//If overhead of creation and runtime creation not required then use this
	private static SingletonEagerInit uniqueInstance = new SingletonEagerInit(); 
	//Other Useful instances here
	private SingletonEagerInit(){}
	//Object already created
	public static SingletonEagerInit getInstance(){
		return uniqueInstance;
	}
	//Other Useful methods here
}
