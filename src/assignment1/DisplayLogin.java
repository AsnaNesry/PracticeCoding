package assignment1;

import java.util.Scanner;

public class DisplayLogin {

	void display()// method for showing different logins and calling the methods
	// accordingly
	{

		System.out.println("1) Administrator");
		System.out.println("2) User");
		System.out.println("3) Exit");

		LoginCredentialsAdmin la = new LoginCredentialsAdmin();
		LoginCredentialUser lu = new LoginCredentialUser();

		Scanner sc = new Scanner(System.in);
		System.out.println("Login as:");

		int menuChoice1 = sc.nextInt();

		switch (menuChoice1) {
		case 1:

			la.validateAdmin();
			break;

		case 2:
			lu.validateUser();
			break;

		case 3:
			System.out.println("you successfully logged out");
			System.exit(0);
			break;

		}// end of switch
	}// end of method display

}
