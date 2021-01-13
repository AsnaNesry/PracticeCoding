package exception_example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedExceptionExample {

	public static void main(String[] args) {

		PrintWriter pw = null;
		try {
			pw = new PrintWriter("D:\\test.txt");
			pw.println("saved");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
		} finally {
			pw.close();
		}
		System.out.println("file saved successfully");

	}// end of main method

}// end of class
