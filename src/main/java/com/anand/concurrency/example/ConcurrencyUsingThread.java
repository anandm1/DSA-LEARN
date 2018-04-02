/**
 * 
 */
package com.anand.concurrency.example;

/**
 * @author U45999
 *
 */
class Runner3 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;++i){
			System.out.println("Runner 3 :: "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Runner4 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;++i){
			System.out.println("Runner 4 :: "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ConcurrencyUsingThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runner3 r3 = new Runner3();
		Runner4 r4 = new Runner4();
		r3.start();
		r4.start();
	}

}
