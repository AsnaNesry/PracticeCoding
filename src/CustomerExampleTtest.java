import java.util.Scanner;

public class CustomerExampleTtest {

	public static void main(String[] args) {
		
  	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter cus_id: ");
	  int id = sc.nextInt();
	  System.out.println("enter cus_age: ");
	  int age = sc.nextInt();
	  
	  System.out.println("enter  cus_name: ");
	  String name = sc.next();
	  System.out.println("enter  email: ");
	  String email = sc.next();
	  System.out.println("enter  phone: ");
	  String phone = sc.next();
	  
	  CustomerExample ce = new CustomerExample(id,age,name,email,phone);

	  
	  
  	  ce.display();

	}//end of main method

}//end of class
