package exception_example;

public class PasswordCorrectException extends Exception {

	String message;

	PasswordCorrectException() {

	}

	PasswordCorrectException(String message) {
		super(message);
		this.message = message;
	}

	public String toString() {
		return message;
	}

}
