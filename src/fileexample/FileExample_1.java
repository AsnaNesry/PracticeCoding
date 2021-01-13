package fileexample;

import java.io.File;

public class FileExample_1 {
	static void display(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		File f = new File("D:\\fileexample");
		File f1 = new File(f, "Profile.docx");
		display("file name: " + f1.getName());
		display("path is: " + f1.getPath());
		display("Absolute Path is: " + f1.getAbsolutePath());
		display("parent is: " + f1.getParent());
		display(f1.exists() ? "exists...." : "does not exists");
		display(f1.canWrite() ? "Is Writable...." : "Is not Writable");
		display(f1.canRead() ? "Is Readable...." : "Is not Readable");
		display(f1.isDirectory() ? "Is Directory...." : "Is not not Directory");
		display(f1.isFile() ? "Is file...." : "Is not file");
		display(f1.isAbsolute() ? "Is Absolute" : "Is not Absolute");
		display("file last modified: " + f1.lastModified());
		display("file size" + f1.length() + "Bytes");

	}

}
