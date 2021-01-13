package assignment1;

import java.util.Scanner;

public class LoginCredentialUser {

	String actualUsername = "athira";
	String actualPassword = "athira1998";

	DisplayLogin dl = new DisplayLogin();

	public String getUsername() // method for getting the username given by user
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("enter  username: ");
		String username = sc.next();

		return username;

	}// end of method getUser

	public String getPassword()// method for getting the password given by user
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter user password: ");
		String password = sc.next();

		return password;
	}// end of method getPassword

	public void validateUser()// method for validating customer or user
	{
		String username = getUsername();
		String password = getPassword();
		if (username.equals(actualUsername)) {
			if (password.equals(actualPassword)) {
				System.out.println("User Login Successful");
				dl.display();
			} // end of if
			else {
				System.out.println("invalid password");
				System.out.println("User Login Unsuccessful");
				dl.display();
			}

		}

		else {
			System.out.println("invalid username");
			System.out.println("User Login Unsuccessful");
			dl.display();
		} // end of else

	}// end of method validateUser

}
