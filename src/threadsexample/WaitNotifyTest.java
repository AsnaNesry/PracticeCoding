package threadsexample;

public class WaitNotifyTest {

	public static void main(String[] args) {
		Message msg = new Message("process it");
		Waiter waiter = new Waiter(msg);
		new Thread(waiter, "waiter").start();

		Notifier notifier = new Notifier(msg);
		new Thread(notifier, "notifier").start();
		System.out.println("All the threads are started");

	}

}
