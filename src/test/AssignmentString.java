package test;
import java.util.Scanner;

public class AssignmentString {

	public static void main(String[] args) {
		
		String validPassword="hashing123";
		String validUsername="maria";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter valid username: ");
		String username1=sc.next();
		System.out.println("enter valid password: ");
		String password1=sc.next();
		if(validUsername.equals(username1)) {
			if(validPassword.equals(password1)){

				System.out.println("valid password");
				}
			else {
				System.out.println("invalid paassword");
			}

}
		else {
			System.out.println("invalid");
		}
		sc.close();
	}
}

