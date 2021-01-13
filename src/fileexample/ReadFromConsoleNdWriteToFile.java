package fileexample;

import java.util.Scanner;

public class ReadFromConsoleNdWriteToFile {
	Scanner sc = new Scanner(System.in);

	public String username() // method for getting the username given by user
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("enter username: ");
		String username = sc.next();

		return username;

	}// end of method getUser

	public String Password()// method for getting the password given by user
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter password: ");
		String password = sc.next();

		return password;
	}// end of method getPassword
}
