package assignments;

import java.util.Scanner;

public class CheckUsernamePasswordExample {

	static String username1;
	static String password1;

	static Scanner sc = new Scanner(System.in);

	public static void getdata() {
		System.out.println("enter user name: ");
		username1 = sc.next();
		System.out.println("enter password: ");
		password1 = sc.next();
		sc.close();
	}// end of method

	public static void validateData()
			throws InvalidUsernameException1, InvalidUsernameException2, InvalidPasswordException {

		if (username1.length() < 6) {
			throw new InvalidUsernameException2("usename should have more than 6 characters");
		}

		if (username1.length() > 10) {
			throw new InvalidUsernameException1("username should not have more than 10 characters");
		}

		if (password1.length() < 8 || password1.length() > 8) {
			throw new InvalidPasswordException("password should not be less than 8 or greater than 8 characters");
			// end of else
		}
	}// end of class
}

// end of class
