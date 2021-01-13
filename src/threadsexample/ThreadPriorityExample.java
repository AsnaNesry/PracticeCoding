package threadsexample;

public class ThreadPriorityExample implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName() + "  is running");

		try {
			Thread.sleep(1000);

		}
		// end of try
		catch (InterruptedException ie) {

		} // end of catch
		System.out.println(Thread.currentThread().getName() + "  has finished execution");
	}// end of rum method

}// end of class
