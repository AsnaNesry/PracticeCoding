package threadexample;

public class ExtendsDemoTest {

	public static void main(String[] args) {
		ExtendsDemo R1 = new ExtendsDemo("Thread-1");
		R1.start();

		ExtendsDemo R2 = new ExtendsDemo("Thread-2");
		R2.start();

	}

}
