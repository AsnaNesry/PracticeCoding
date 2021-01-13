package arrays;

public class MatrixEx {
	
	
 void calculateOddEven()
	 
	 {
	 int evensum=0;
	 int oddsum=0;
	 int sum=0;
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
					if(arr[incr][incrj]%2==0) {
						
					evensum+= arr[incr][incrj];
					
					}
					
					else {
						oddsum+=arr[incr][incrj];
					}
					 if(incr==incrj) {
					sum+=arr[incr][incrj];
					 }
						
					
				}//end of inner loop
				
			}//end of outer loop
		    System.out.println("even element sum is:" + evensum);
			System.out.println("odd element sum is:" + oddsum);
			System.out.println("sum of diagonal element  is:" + sum);
			
		 
	 }
	 
	
	
	

	public static void main(String[] args){
		MatrixEx me= new MatrixEx();
		me.calculateOddEven();

	}

}
