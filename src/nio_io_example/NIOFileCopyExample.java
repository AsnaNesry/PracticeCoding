package nio_io_example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NIOFileCopyExample {

	public static void main(String[] args) {
		try {
			Path source = Paths.get("D:\\test1\\File4.txt");
			Path destination = Paths.get("D:\\test1\\File5.txt");
			Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
		} // end of try

		catch (InvalidPathException e) {
			System.out.println("path error" + e);
		} // end of catch

		catch (IOException e) {
			System.out.println("I/O Exception " + e);
		} // end of catch
	}// end of main method

}// end of class
