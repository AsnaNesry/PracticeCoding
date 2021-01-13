package fileexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile_1 {

	public static void main(String[] args) {
		int incr;
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("D:\\onam\\Text Document.txt");
			fos = new FileOutputStream("D:\\onam\\Text Documentcopy.txt");
			do {
				incr = fis.read();
				if (incr != -1) {
					fos.write(incr);
				}
			} while (incr != -1);
		} catch (FileNotFoundException e) {
			System.out.println("file not found.....");
			e.printStackTrace();
			return;
		} catch (IOException e) {
			System.out.println("error reading file....");
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				System.out.println("error closing file");
			}
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				System.out.println("error closing file");
			}
		}

	}
}
