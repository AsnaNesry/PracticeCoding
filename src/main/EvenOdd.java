package main;

public class EvenOdd {
                 
	public void methodEx() {
		int number=14;
		if(number%2==0) {
			System.out.println("even number");
		
	}
	else {
		System.out.println("odd number");
	}
	}//end of method
	public static void main(String[] args) {
		
		EvenOdd eo = new EvenOdd();
		eo.methodEx();

	}//end of main

}//end of class
