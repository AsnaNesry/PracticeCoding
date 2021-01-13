package ioexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExample_1 {

	public static void main(String[] args) {
		char ch = ' ';
		/*
		 * InputStreamReader is = new InputStreamReader(System.in); BufferedReader br =
		 * new BufferedReader(is);
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter character, q to exit");
		do {
			try {
				ch = (char) br.read();
				System.out.println(ch);

			} catch (IOException e) {
				e.printStackTrace();

			}
		} while (ch != 'q');

	}

}
