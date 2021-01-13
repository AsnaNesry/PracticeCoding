package main;

public class IfDemo {
	
	void methodOne() {
	
	int var1=200;
	int var2=300;
	if(var1>var2) {
		System.out.println("variable one is greater");
	}//end of if
	else {
		System.out.println("variable two is greater");
	}//end of else
	}
	

	public static void main(String[] args) {
		
		IfDemo md = new IfDemo();
		md.methodOne();
		

	}//end of main

}//end of class
