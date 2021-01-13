package arrays;
import java.util.Scanner;

public class ArrayInputUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter number of rows:");
		int rows = sc.nextInt();
		System.out.println("enter number of columns:");
		int columns = sc.nextInt();
		System.out.println("enter the rows and columns:");
  	  int twoD[][] = new int[rows][columns];
		for (int incr = 0; incr < rows; incr++) {
			for (int incrj = 0; incrj < columns; incrj++) {
				twoD[incr][incrj]=sc.nextInt();

			}//end of inner loop
			
		}//end of outer loop
		sc.close();
System.out.println("data you entered:");
for (int incr = 0; incr < rows; incr++) {
	for (int incrj = 0; incrj < columns; incrj++) {
		System.out.println(twoD[incr][incrj]);
	}
System.out.println();
	}
	}}


