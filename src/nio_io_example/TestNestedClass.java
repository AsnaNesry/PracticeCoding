package nio_io_example;

import nio_io_example.OuterClass.InnerClass;

public class TestNestedClass {

	public static void main(String[] args) {
		System.out.println("outer variable 1 value is " + OuterClass.OUTERVARIABLE_1);
		System.out.println("outer variable 2 value is  " + OuterClass.OUTERVARIABLE_2);

		// creating object of the InnerClass
		// OuterClass.InnerClass oi=new OuterClass.InnerClass();

		System.out.println("outer variable 1 value is " + InnerClass.OUTERVARIABLE_1);
		System.out.println("outer variable 2 value is " + InnerClass.OUTERVARIABLE_2);

	}

}
