package main;

public class NestedIf {
	
	void nestedIfCheck() {
		
		int var1=200;
		int var2=400;
		System.out.println("variable one is:" + var1);
		System.out.println("variable two is:" + var2);
		
		if(var1!=var2) {
			System.out.println("variable one and two are not equal");
			
			if(var1>var2) {
				
				System.out.println("variable one is greater than variable two");
			}
			else {
				System.out.println("variable two is greater than variable one");
			}//end of nested if
		}//end of if
		else {
			System.out.println("variable one and two are equal");
		}//end of else
	}//end of class

	public static void main(String[] args) {
		
		NestedIf ni = new NestedIf();
		ni.nestedIfCheck();

	}//end of main

}//end of class
