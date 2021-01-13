package ioexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExample_2 {

	public static void main(String[] args) {

		/*
		 * InputStreamReader is = new InputStreamReader(System.in); BufferedReader br =
		 * new BufferedReader(is);
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = " ";
		System.out.println("Enter lines of text:");
		System.out.println("Enter stop to quit:");

		System.out.println("Enter character, q to exit");
		do {
			try {
				str = br.readLine();
				System.out.println(str);

			} catch (IOException e) {
				e.printStackTrace();

			}
		} while (!str.equals("stop"));

	}

}
