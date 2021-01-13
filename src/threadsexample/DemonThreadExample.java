package threadsexample;

public class DemonThreadExample extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread is executing");
		} // end of if
		else {
			System.out.println("Normal thread is executing");
		} // end of else
	}// end of run method

	public static void main(String[] args) {
		DemonThreadExample thread1 = new DemonThreadExample();
		DemonThreadExample thread2 = new DemonThreadExample();

		thread1.setDaemon(true);

		thread1.start();
		thread2.start();

	}// end of main method

}// end of class
