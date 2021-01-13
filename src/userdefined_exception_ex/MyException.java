package userdefined_exception_ex;

public class MyException extends Exception {

	private int detail;

	MyException(int arg) {
		detail = arg;
	}

	public String toString() {
		return "MyException[" + detail + "]";

	}

}
