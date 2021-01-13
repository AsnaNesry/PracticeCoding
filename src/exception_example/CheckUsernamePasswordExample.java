package exception_example;

import java.util.Scanner;

public class CheckUsernamePasswordExample {

	static String username = "infy";
	static String password = "mys";

	static String username1;
	static String password1;

	static Scanner sc = new Scanner(System.in);

	public static void getdata() {
		System.out.println("enter user name: ");
		username1 = sc.next();
		System.out.println("enter password: ");
		password1 = sc.next();
		sc.close();
	}

	public static void validateData() throws UsernameCorrectException, PasswordCorrectException {
		if (username.equals(username1)) {
			throw new UsernameCorrectException("username is correct");
		} else if (password.equals(password1)) {
			throw new PasswordCorrectException("password is correct");
		}

	}

}
