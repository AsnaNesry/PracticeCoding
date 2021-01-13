package assignmentoninterfaces;

public class NestedTryCatch {

	public static void calculate(int arg1, int arg2) {
		int res = 0;
		// res = arg1 / arg2;
		int array[] = new int[5];
		// array[5] = res;

		try {
			System.out.println("inside try block 1");
			try {
				System.out.println("inside try block 2");
				array[5] = res;
			} catch (ArrayIndexOutOfBoundsException ae) {
				System.out.println("inside catch block 2");
				array[4] = res;
			}
			res = arg1 / arg2;
		} // end of try block
		catch (ArithmeticException e) {
			System.out.println("inside catch block 1");
			res = arg1 / 2;
			System.out.println("Result" + res);
		} // end of catch

	}// end of method
}// end of class
