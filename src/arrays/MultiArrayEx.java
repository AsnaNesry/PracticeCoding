package arrays;

public class MultiArrayEx {

	public static void main(String[] args) {
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

		for (int incr = 0; incr < arr.length; incr++) {
			for (int incrj = 0; incrj < arr[incr].length; incrj++) {
				System.out.print(" " + arr[incr][incrj]);

			}//end of inner loop
			System.out.println();
		}//end of outer loop
		
		
//creating and initializing 2D array
		
		int[][] arrInt= {{1,2},{3,4,5}};
		for (int incr = 0; incr < arrInt.length; incr++) {
			for (int incrj = 0; incrj < arrInt[incr].length; incrj++) {
				System.out.print(" " + arrInt[incr][incrj]);

			}//end of inner loop
			System.out.println();
		}//end of outer loop
		
		
//initializing multi dimensional array
		int[][] arrmulti=new int[2][1];
		
		arrmulti[0]=new int[2];
		arrmulti[1]=new int[3];
		
		arrmulti[0][0]=33;
		arrmulti[0][1]=44;
		arrmulti[1][0]=55;
		arrmulti[1][1]=66;
		arrmulti[1][2]=77;
		
		for (int incr = 0; incr < arrInt.length; incr++) {
			for (int incrj = 0; incrj < arrmulti[incr].length; incrj++) {
				System.out.print(" " + arrmulti[incr][incrj]);

			}//end of inner loop
			System.out.println();
		}//end of outer loop
		
		
	}

}
