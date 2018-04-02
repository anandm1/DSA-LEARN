/**
 * 
 */
package com.anand.concurrency.example;

/**
 * @author U45999
 *
 */
class Worker implements Runnable{
	//Some time , this variable might go and sit in cache of machine then no matter what it will
	//refer false value only.to prevent that use
	private volatile boolean isTerminated = false;
	@Override
	public void run() {
		while(!isTerminated){
			System.out.println("Hello from worker class .....");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * @return the isTerminated
	 */
	public boolean isTerminated() {
		return isTerminated;
	}
	/**
	 * @param isTerminated the isTerminated to set
	 */
	public void setTerminated(boolean isTerminated) {
		this.isTerminated = isTerminated;
	}
	
}

public class ConcurrencyVolatileExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Worker worker = new Worker();
		Thread t1 = new Thread(worker);
		t1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		worker.setTerminated(true);
		System.out.println("Finished the Tasks.....");
	}

}
