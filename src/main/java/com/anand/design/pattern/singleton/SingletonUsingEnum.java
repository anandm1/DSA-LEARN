/**
 * 
 */
package com.anand.design.pattern.singleton;

/**
 * @author U45999
 *
 */
public enum SingletonUsingEnum {
	//Enum is thread safe and implementation,
	//of Singleton through Enum ensures that your, 
	//singleton will have only one instance even in, 
	//a multi-threaded environment
	UNIQUEINSTANCE;
	//Other Useful variable , methods here
	public void doStuff(){
	     System.out.println("Singleton using Enum");
	 }
	//And this can be called from clients :
	//SingletonEnum.INSTANCE.doStuff();
}
