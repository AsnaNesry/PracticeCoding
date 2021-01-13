package main;
import java.util.Scanner;
public class ScannerTest {
	
      public static void main(String[] args) {
    	  
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("enter your roll number: ");
    	  int rollno = sc.nextInt();
    	  
    	  System.out.println("enter your name: ");
    	  String name = sc.next();
    	  
    	  System.out.println("enter your fees: ");
    	  double fees = sc.nextDouble();
    	  
    	  System.out.println("\n\t Rollno:"+rollno+"\n\tname is:"+name+"\n\tfees:"+fees);
    	  sc.close();
    	  
    	  
	

	}

}
