package assignmentoninterfaces;

import java.util.Scanner;

public class TestUsernamePassword {

	public static void main(String[] args) {
		String actualUsername = "asna";
		String actualPassword = "asna1997";

		Scanner sc = new Scanner(System.in);

		System.out.println("enter  username: ");
		String username = sc.next();
		System.out.println("enter  password: ");
		String password = sc.next();
		sc.close();

		UsernamePassword upd = new UsernamePassword();
		Username up = new Username();
		Password pd = new Password();

		if (username.equals(actualUsername)) {
			if (password.equals(actualPassword)) {
				System.out.println(upd);
			} else {
				System.out.println(pd);
			}
		} // end of if
		else {
			System.out.println(up);

		} // end of else

	}// end of main method

}// end of class
