package src.testpack1;



public class ValidateUser {
	

	  
	
	protected String actualUsername;
	protected String actualPassword;
	
	protected ValidateUser(String username,String password){
		actualUsername=username;
		actualPassword=password;
		
	}
	
	protected  void validUser(String username,String password)
	{
		 if(username.equals(actualUsername)) {
			  if(password.equals(actualPassword)) {
				  System.out.println("valid user");
			  
			  } else {
				  System.out.println("invalid user");  
			  }
	      }//end of if
		  else {
			  System.out.println("invalid user");
		  }//end of else
	
	
	}//end of method
	

}//end of class
