package fileexample;

import java.io.File;
import java.io.FilenameFilter;

public class DirListOnlyWithExtension {

	public static void main(String[] args) {

		String dirName = "C:\\Users\\Asna Nesry\\eclipse-workspace\\Myfirstproject\\src";
		File f1 = new File(dirName);
		FilenameFilter fnf = new OnlyExtension(".java");
		String[] str = f1.list(fnf);
		for (int incr = 0; incr < str.length; incr++) {
			System.out.println(str[incr]);
		}

	}

}
