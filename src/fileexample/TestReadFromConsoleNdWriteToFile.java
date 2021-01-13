package fileexample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestReadFromConsoleNdWriteToFile {

	public static void main(String[] args) {
		BufferedWriter bw = null;
		BufferedReader br = null;
		String str = " ";

		try {
			System.out.println("enter multiple lines: ");
			br = new BufferedReader(new InputStreamReader(System.in));

			File myFile = new File("D:\\onam\\Text Documentcopy3.txt");
			if (!myFile.exists()) {
				myFile.createNewFile();
			}
			FileWriter writer = new FileWriter(myFile);
			bw = new BufferedWriter(writer);

			while (!str.equals("stop")) {
				str = br.readLine();

				bw.write(str);
				bw.newLine();

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (Exception ex) {

			}
		}

	}
}
