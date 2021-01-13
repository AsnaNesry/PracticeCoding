package assingnmenttoexception;

public class InvalidPasswordException extends Exception {

	String message;

	InvalidPasswordException() {

	}

	InvalidPasswordException(String message) {
		super(message);
		this.message = message;
	}

	public String toString() {
		return message;
	}

}
