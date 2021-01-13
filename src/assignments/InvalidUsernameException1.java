package assignments;

public class InvalidUsernameException1 extends Exception {

	String message;

	InvalidUsernameException1() {

	}

	InvalidUsernameException1(String message) {
		super(message);
		this.message = message;
	}// end of constructor

	public String toString() {
		return message;
	}// end of tostring() method

}// end of class
