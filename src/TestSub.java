
public class TestSub extends TestSuper {

	int var3 = 300;
	int var4 = 400;

	void display() {
		System.out.println("variable three: " + var3);
		System.out.println("variable four: " + var4);
		super.display();
	}

	public static void main(String[] args) {
		TestSub ts = new TestSub();

		ts.display();

	}

}
