/**
 * 
 */
package com.anand.basic.concurrency;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author U45999
 *
 */
class ThreadA implements Runnable{
	ThreadA(){
		final Object lock = new ReentrantLock();
		Thread t = new Thread();
		t.start();
		try {
			synchronized(lock){
				t.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Is thread t Alive :: "+t.isAlive());
	}
	@Override
	public void run() {
		System.out.println("In thread A run");
	}
}
public class ThreadExample {
	public static void main(String[] args) {
		
		Thread t1 = new Thread();
		t1.start();
		try {
			synchronized(t1){
				System.out.println("In synchronized");
			t1.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Is thread t1 Alive :: "+t1.isAlive());
		new ThreadA();
		
	}
}
