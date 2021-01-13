package exceptions_example;

public class FirstExceptionExample {

	static void calculate(int arg1, int arg2) {

		int array[] = new int[5];
		int res = 0;

		try {

			res = arg1 / arg2;// this will raise ArithmeticException
			// System.out.println("exception raised or not raised inside try");
			array[5] = res;// this will raise ArrayIndexOutOfBoundsEexception

		} catch (ArithmeticException e) {
			res = arg1 / 2;
			// System.out.println("exception raised or not raised inside catch");
		} // end of catch block

		catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Inside catch block of ArrayIndexOutofBoundException ae");
			array[4] = res;
		} // end of catch block

		finally {
			System.out.println("i will be executed if exception raised or not raised ");
		}

		/*
		 * try { array[5]=res;
		 * 
		 * }catch(ArrayIndexOutOfBoundsException ae) {
		 * System.out.println("Inside catch block of ArrayIndexOutofBoundException ae");
		 * array[4]=res; }//end of catch block
		 */

		System.out.println("result is" + res);
	}// end of method

}// end of class
