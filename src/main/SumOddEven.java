package main;

public class SumOddEven {
	
	void sumEvenOdd()
	{
		int evensum=0;
		int oddsum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				evensum=evensum+=i;
			}
			else {
				oddsum=oddsum+i;
				}
		}
			System.out.println("sum of even number is "+evensum);
			System.out.println("sum of odd number is "+oddsum);
		
			

		
				
		
	}

	public static void main(String[] args) {
		SumOddEven se = new SumOddEven();
		se.sumEvenOdd();

	}

}
