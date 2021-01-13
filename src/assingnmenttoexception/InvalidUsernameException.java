package assingnmenttoexception;

public class InvalidUsernameException extends Exception {

	String message;

	InvalidUsernameException() {

	}

	InvalidUsernameException(String message) {
		super(message);
		this.message = message;
	}// end of constructor

	public String toString() {
		return message;
	}// end of tostring() method

}// end of class
