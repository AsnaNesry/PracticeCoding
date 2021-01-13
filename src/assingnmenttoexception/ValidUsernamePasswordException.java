package assingnmenttoexception;

public class ValidUsernamePasswordException extends Exception {
	String message;

	ValidUsernamePasswordException() {

	}

	ValidUsernamePasswordException(String message) {
		super(message);
		this.message = message;
	}// end of constructor

	public String toString() {
		return message;
	}// end of tostring() method

}// end of class
