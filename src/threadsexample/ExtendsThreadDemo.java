package threadsexample;

public class ExtendsThreadDemo extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 50; i++) {
				System.out.println(i);
				Thread.sleep(100);
			}
		} // end of try
		catch (InterruptedException e) {

		} // end of catch

	}// end of run method
}// end of class