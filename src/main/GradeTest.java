package main;

import java.util.Scanner;
public class GradeTest {
	
	void checkGradeSheet()
	{
		Scanner sc= new Scanner(System.in);
	    System.out.println("\nenter your mark:");
	    int mark = sc.nextInt();
	    
		if(mark<50) {
			System.out.println("failed");
		}
		else if(mark>=50 && mark<60) {
			System.out.println("D grade");
		}
		else if(mark>=60 && mark<70) {
		
			System.out.println("C grade");
		}
		else if(mark>=70 && mark<80) {
			
			System.out.println("B grade");
		}
		else if(mark>=80 && mark<90) {
			System.out.println("A grade");
		}
		else if(mark>=90 && mark<100) {
			System.out.println("A+ grade");
		}
		else {
			System.out.println("Invalid Grade");
		}//end of if else
		}//end of method

	public static void main(String[] args) {
		
		GradeTest gt = new GradeTest();
		gt.checkGradeSheet();
		
		

	}//end of main

}//end of class
