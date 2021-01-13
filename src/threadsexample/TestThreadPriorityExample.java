package threadsexample;

public class TestThreadPriorityExample {
	public static Thread T1, T2;

	public static void main(String[] args) {
		ThreadPriorityExample tpe = new ThreadPriorityExample();
		Thread T1 = new Thread(tpe);
		Thread T2 = new Thread(tpe);

		System.out.println("default priority of of thread is: " + T1.getName() + " = " + T1.getPriority());
		System.out.println("default priority of of thread is: " + T2.getName() + " = " + T2.getPriority());

		T1.setPriority(Thread.MAX_PRIORITY - 6);
		T2.setPriority(7);
		T1.start();
		T2.start();

		System.out.println("default priority of of thread is: " + T1.getName() + " = " + T1.getPriority());
		System.out.println("default priority of of thread is: " + T2.getName() + " = " + T2.getPriority());

	}// end of main method

}// end of class
