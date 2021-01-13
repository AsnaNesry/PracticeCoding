package threadsexample;

public class ThreadJoin extends Thread {

	public void run() {
		for (int incr = 1; incr <= 5; incr++) {
			try {
				Thread.sleep(500);
			} // end of try
			catch (Exception e) {
				System.out.println(e);
			} // end of catch
			System.out.println(Thread.currentThread().getName() + "->" + incr);
		} // end of for loop
	}// end of run method
}// end of class
