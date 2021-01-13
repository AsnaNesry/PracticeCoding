package assingnmenttoexception;

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
	}// end of method

	public static void validateData()
			throws InvalidUsernameException, InvalidPasswordException, ValidUsernamePasswordException {
		if (!username.equals(username1)) {
			if (!password.equals(password1)) {
				throw new InvalidPasswordException("password is incorrect");
			}
			throw new InvalidUsernameException("username is incorrect");
		} // end of if
		else {
			throw new ValidUsernamePasswordException("valid user");
		} // end of else
	}

}// end of class
