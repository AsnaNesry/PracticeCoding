
public class CustomerExample {
	
    int cus_id=101;
    int cus_age=18;
    String cus_name="aaa";
    String cus_email="asd@gmail.com";
    String cus_phone="9072403306";
    
	
	CustomerExample(int cus_id,int cus_age,String cus_name,String cus_email,String cus_phone){
		    this.cus_id=cus_id;
		    this.cus_age=cus_age;
		    this.cus_name=cus_name;
		    this.cus_email=cus_email;
		    this.cus_phone=cus_phone;
		    
		
	}

	
	void display(){
		this.cus_id=cus_id;
	    this.cus_age=cus_age;
	    this.cus_name=cus_name;
	    this.cus_email=cus_email;
	    this.cus_phone=cus_phone;
	    
	    if(cus_age>=18) {
		 
		 
		 System.out.println("customer id is " + this.cus_id);
		 System.out.println("customer age is " + this.cus_age);
		 System.out.println("customer name is " + this.cus_name);
		 System.out.println("Employee email is " + this.cus_email);
		 System.out.println("Employee phone is " + this.cus_phone);
	    }//end of if
	    else
	    {
	    	System.out.println("not valid");
	    }//end of else
	}//end of function
}//end of class
