/**
 * 
 */
package com.anand.design.pattern.singleton;

/**
 * @author U45999
 *
 */
public class SingletonDoubleCheckLockWithVolatile {
	//with double-checked locking , we first check to see if an
	//instance is created, and if not, THEN we synchronize.
	//This way we synchronize only FIRST Time. 
	//Volatile keyword ensure that multiple threads handle the uniqueInstance,
	//variable correctly when it is being initialized to Singleton Instance
	private volatile static SingletonDoubleCheckLockWithVolatile uniqueInstance;
	//Other Useful instances here
	private SingletonDoubleCheckLockWithVolatile(){}
	public static SingletonDoubleCheckLockWithVolatile getInstance(){
		//check for instance if there is not one , then enter a synchronized block
		if(uniqueInstance == null){
			synchronized(SingletonLazyInit.class){
				if(uniqueInstance == null){
					uniqueInstance = new SingletonDoubleCheckLockWithVolatile();
				}
			}
		}
		return uniqueInstance;
	}
	//Other Useful methods here
}
