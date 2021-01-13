package userdefined_exception_ex;

public class TestUserDefinedException {
	public static void main(String args[]) {

		try {
			UserDefinedException.compute(9);
			UserDefinedException.compute(10);// handling exception from where it is called
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
