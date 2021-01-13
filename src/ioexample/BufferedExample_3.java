package ioexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedExample_3 {

	String actualUsername = "asna";
	String actualPassword = "1234";
	String str1 = " ";
	String str2 = " ";

	public String getUsername() // method for getting the username given by user
	{
		System.out.println("enter username: ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			str1 = (String) br.readLine();
		} catch (IOException e) {

			e.printStackTrace();
		}

		return str1;

	}// end of method getUser

	public String getPassword()// method for getting the password given by user
	{
		System.out.println("enter password: ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			str2 = (String) br.readLine();

		} catch (IOException e) {
			e.printStackTrace();

		}

		return str2;
	}// end of method getPassword

	public void validateUser()// method for validating customer or user
	{
		String username = getUsername();
		String password = getPassword();
		if (username.equals(actualUsername)) {
			if (password.equals(actualPassword)) {
				System.out.println("User Login Successful");

			} // end of if
			else {
				System.out.println("invalid password");
				System.out.println("User Login Unsuccessful");
			}

		}

		else {
			System.out.println("invalid username");
			System.out.println("User Login Unsuccessful");
		} // end of else

	}// end of method validateUser

}// end of class
