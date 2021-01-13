package assignment1;

import java.util.Scanner;

public class LoginCredentialsAdmin {

	String actualadminUsername = "asna";
	String actualadminPassword = "asna1997";
	DisplayLogin dl = new DisplayLogin();

	public String adminUsername() // method for getting the username given by user
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("enter Admin username: ");
		String username = sc.next();

		return username;

	}// end of method getUser

	public String adminPassword()// method for getting the password given by user
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter Admin password: ");
		String password = sc.next();

		return password;
	}// end of method getPassword

	void getPermission()// method for getting permission for the admin to enter items
						// and details
	{

		System.out.println("1) Add items");
		System.out.println("2) Modify items");
		System.out.println("3) Delete Items");
		System.out.println("4) Exit");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice: ");
		int menuChoice2 = sc.nextInt();

		switch (menuChoice2) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:

			dl.display();

		}// end of switch

	}// end of method getPermission

	public void validateAdmin()// method for validating admin
	{
		String username = adminUsername();
		String password = adminPassword();
		if (username.equals(actualadminUsername)) {

			if (password.equals(actualadminPassword)) {
				System.out.println("Admin login successful");
				getPermission();
			} // end of if
			else {
				System.out.println("invalid password");
				System.out.println("Admin login unsuccessful");
				dl.display();
			}

		} // end of if
		else {
			System.out.println("Invalid Username");
			System.out.println("Admin login unsuccessful");
			dl.display();

		} // end of else

	}// end of method validateAdmin

}// end of class
