package fileexample;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		int size;
		try (FileReader fin = new FileReader("D:\\onam1\\Text Document.txt")) {

			int count;
			while ((count = fin.read()) != -1) {
				System.out.println((char) fin.read());

			}

		}

		catch (IOException e) {
			System.out.println("I/O Error" + e);

		}
	}
}

// }
