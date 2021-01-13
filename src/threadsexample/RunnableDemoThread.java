package threadsexample;

public class RunnableDemoThread implements Runnable {

	public void run() {
		try {
			for (int incr = 0; incr < 100; incr++) {
				System.out.println(incr);
				Thread.sleep(100);
			}
		} // end of try
		catch (InterruptedException e) {
			e.printStackTrace();
		} // end of catch
	}// end of method run

}// end of class
