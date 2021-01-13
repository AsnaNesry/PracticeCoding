package threadsexample;

public class TestThreadJoin {

	public static void main(String[] args) {

		ThreadJoin t1 = new ThreadJoin();
		t1.setName("t1");

		ThreadJoin t2 = new ThreadJoin();
		t2.setName("t2");

		ThreadJoin t3 = new ThreadJoin();
		t3.setName("t3");

		t1.start();
		try {
			t1.join();
		} // end of try
		catch (InterruptedException e) {

		} // end of catch
		t2.start();

		t3.start();
		System.out.println("abc");

	}// end of main method

}// end of class
