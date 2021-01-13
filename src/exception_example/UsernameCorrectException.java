package exception_example;

public class UsernameCorrectException extends Exception {

	String message;

	UsernameCorrectException() {

	}

	UsernameCorrectException(String message) {
		super(message);
		this.message = message;
	}

	public String toString() {
		return message;
	}

}
