package arrays;

public class ArrayOddEven {

	public static void main(String[] args) {
		int array[]= {200,300,400,500,600,3,7};//array declaration and instantiation
		System.out.println("Even Numbers are:");
		
		for(int incr=0;incr<array.length;incr++) {
			if(array[incr]%2==0) {
				
				
				System.out.println(array[incr]);
			}
			
		}
		
		System.out.println("Odd Numbers are:");
		
		for(int incr=0;incr<array.length;incr++) {
			
			if(array[incr]%2!=0) {
				System.out.println(array[incr]);
			
			}	
			
		}

	}//end of main

}//end of class
