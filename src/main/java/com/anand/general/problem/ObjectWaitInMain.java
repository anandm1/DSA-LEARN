/**
 * 
 */
package com.anand.general.problem;

/**
 * @author U45999
 *
 */
public class ObjectWaitInMain {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	static boolean isWaitingForYou = true;
	public static void main(String[] args) throws InterruptedException {
		ObjectWaitInMain objectWaitInMain = new ObjectWaitInMain();
	    System.out.println("Main Started");
	    synchronized (objectWaitInMain) {
	    	while(isWaitingForYou){
	    		objectWaitInMain.wait();
            }
	    }
	    synchronized(objectWaitInMain){
            isWaitingForYou = false;
            objectWaitInMain.notify();
       }
	    
	    System.out.println("Main Terminated");

	}

}
