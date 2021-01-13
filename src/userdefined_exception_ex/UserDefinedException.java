package userdefined_exception_ex;

public class UserDefinedException {
	static void compute(int num) throws Exception {
		System.out.println("called computer[" + num + "]");
		if (num < 10) {
			System.out.println("number is less than 10");

		} else {

			throw new MyException(num);// if try and catch block not included,it must be unchecked exception,that is we
										// must extend from exception other than RuntimeException.

		}

	}
}
