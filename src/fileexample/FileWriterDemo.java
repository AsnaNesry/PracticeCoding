package fileexample;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		String source = "Christmas is celebrated on December 25 and is both a sacred religious holiday and a worldwide cultural and commercial phenomenon. For two millennia, people around the world have been observing it with traditions and practices that are both religious and secular in nature. Christians celebrate Christmas Day as the anniversary of the birth of Jesus of Nazareth, a spiritual leader whose teachings form the basis of their religion";
		char buf[] = new char[source.length()];
		source.getChars(0, source.length(), buf, 0);

		try {
			FileWriter fos1 = new FileWriter("D:\\test\\File11.txt");
			FileWriter fos2 = new FileWriter("D:\\test\\File21.txt");
			FileWriter fos3 = new FileWriter("D:\\test\\File31.txt");

			for (int incr = 0; incr < buf.length; incr += 2) {
				fos1.write((char) buf[incr]);
			}

			fos2.write(buf);

			fos3.write(buf, buf.length - buf.length / 4, buf.length / 4);

		} catch (IOException e) {
			System.out.println("An io error occured");
		}

	}
}