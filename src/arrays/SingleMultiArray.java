package arrays;

public class SingleMultiArray {

		void findEvenSingleD() {
			int array[]= {200,300,400,500,600,3,7};//array declaration and instantiation
	        System.out.println("Even Numbers in sigle dimensinal array are:");
		
		for(int incr=0;incr<array.length;incr++) {
			if(array[incr]%2==0) {
				
				
				System.out.println(array[incr]);
			}
			
		}
		}

		void findEvenMultiD() {
		int arr[][] = new int[3][3];
		arr[0][0] = 30;
		arr[0][1] = 40;
		arr[0][2] = 50;

		arr[1][0] = 33;
		arr[1][1] = 43;
		arr[1][2] = 53;

		arr[2][0] = 44;
		arr[2][1] = 34;
		arr[2][2] = 54;
		
		 System.out.println("Even Numbers in Multi dimensional  array are:");

		for (int incr = 0; incr < arr.length; incr++) {
			for (int incrj = 0; incrj < arr[incr].length; incrj++) {
				if(arr[incr][incrj]%2==0) {
					
					System.out.print(" " + arr[incr][incrj]);

					}
			}
			

			}//end of inner loop
			System.out.println();
		}//end of outer loop
		
		



	public static void main(String[] args) {
		
		SingleMultiArray sm=new SingleMultiArray();
		sm.findEvenSingleD();
		sm.findEvenMultiD();
		
	}
		
	}
