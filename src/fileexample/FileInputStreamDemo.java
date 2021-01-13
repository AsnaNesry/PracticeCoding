package fileexample;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		int size;
		try (FileInputStream fin = new FileInputStream("D:\\onam\\Text Document.txt")) {
			System.out.println("Total Available byte : " + (size = fin.available()));
			int no = size / 40;
			System.out.println("first" + no + "bytes of the file one read() at a time");
			for (int incr = 0; incr < no; incr++) {
				System.out.println((char) fin.read());

			}

			System.out.println("\n still available bytes : " + fin.available());
			System.out.println("reading the next" + no + "with one read(b[])");
			byte b[] = new byte[no];
			if (fin.read(b) != no) {
				System.err.println("could not read" + no + "bytes");

			}
			System.out.println(new String(b, 0, no));
			System.out.println("\n still available bytes : " + fin.available());
			System.out.println("skipping half of remaining bytes with skip()");
			fin.skip(size / 2);
			System.out.println("still available" + fin.available());

			System.out.println("reading" + no / 2 + "into end of array");
			if (fin.read(b, no / 2, no / 2) != no / 2) {
				System.out.println("couldn't read:" + no / 2 + "bytes");
			}
			System.out.println(new String(b, 0, b.length));
			System.out.println("\n still available" + fin.available());
		} catch (IOException e) {
			System.out.println("I/O Error" + e);
		}

	}

}
