package fileexample;

import java.io.File;

public class File_DirList_2 {

	public static void main(String[] args) {
		String dirName = "C:\\Users\\Asna Nesry\\Desktop\\AICTE";
		File f1 = new File(dirName);
		if (f1.isDirectory()) {
			System.out.println("Directory of" + dirName);
			String str[] = f1.list();
			for (int incr = 0; incr < str.length; incr++) {
				File file = new File(dirName + "//" + str[incr]);
				if (file.isDirectory()) {
					System.out.println(str[incr] + "is Directory....");
				} // end of if
				else {
					System.out.println(str[incr] + "is a File....");
				} // end of else

			} // end of for
		} else {
			System.out.println(dirName + "is not a Directory....");
		} // end of else

	}// end of if

}// end of class
