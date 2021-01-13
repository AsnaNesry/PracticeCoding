package assignments;

public class InvalidPasswordException extends Exception {
	String message;

	InvalidPasswordException() {

	}

	InvalidPasswordException(String message) {
		super(message);
		this.message = message;
	}// end of constructor

	public String toString() {
		return message;
	}// end of tostring() method

}// end of class
