package assignments;

public class InvalidUsernameException2 extends Exception {

	String message;

	InvalidUsernameException2() {

	}

	InvalidUsernameException2(String message) {
		super(message);
		this.message = message;
	}

	public String toString() {
		return message;
	}

}
