import java.util.Scanner;

import assignmentoninterfaces.InterfaceThree;

public class TestUsernamePassword implements InterfaceThree {
	String actualUsername="asna";
	String actualPassword="asna1997";
	 

	public static void main(String[] args) {
	
		TestUsernamePassword tup=new TestUsernamePassword();
		String username = tup.getUser();
		String password = tup.getPassword();
		tup.validateUser(username, password);
		
	}//end of main method

	@Override
	public String getUser() {
		
		Scanner sc = new Scanner(System.in);
		
		  System.out.println("enter  username: ");
		  String username = sc.next();
		  
		  return username;
	
		
	}

	@Override
	public void validateUser(String username, String password) {
		  UsernamePassword upd= new UsernamePassword();
		  Username up=new Username();
		  Password pd=new Password();
		  if(username.equals(actualUsername)) {
    		  if(password.equals(actualPassword)) {
    		  System.out.println(upd);
    		  }
    		  else {
    			  System.out.println(pd);
    		  }
    	  }//end of if
    	  else {
    		  System.out.println(up);
    		  
    	  }//end of else		
		
	}

	@Override
	public String getPassword() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter  password: ");
		  String password = sc.next();
		
		return password;
	}

}//end of class
