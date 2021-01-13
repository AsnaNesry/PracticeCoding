package src.testpack2;
import java.util.Scanner;

import src.testpack1.ValidateUser;

public class ValidateUserSub extends ValidateUser  {
	
	  
	ValidateUserSub(String actualUsername, String actualPassword){
		super(actualUsername, actualPassword);
		
	}
	
	
	
      void getUser() {
	  Scanner sc = new Scanner(System.in);
	
	  System.out.println("enter  username: ");
	  String username = sc.next();
	  System.out.println("enter  password: ");
	  String password = sc.next();
	  
	  validUser(username, password);
	 
      }//end of method
}//end of class
