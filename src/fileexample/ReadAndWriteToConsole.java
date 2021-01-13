package fileexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadAndWriteToConsole {

	public static void main(String[] args) {
		int incr;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\onam\\Text Documentcopy.txt");
			do {
				incr = fis.read();
				if (incr != -1) {
					System.out.print((char) incr);
				}
			} while (incr != -1);// end of do while
		} // end of try
		catch (FileNotFoundException e) {
			System.out.println("file not found.....");
			e.printStackTrace();
			return;

		} // end of catch
		catch (IOException e) {
			System.out.println("error reading file....");

		} // end of catch
		finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} // end of try
			catch (IOException e) {
				System.out.println("error closing file");
			} // end of catch
		} // end of finally block

	}// end of main method
}// end of class
