package fileexample;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileTryWithResource {

	public static void main(String[] args) {
		String source = "Christmas is celebrated on December 25 and is both a sacred religious holiday and a worldwide cultural and commercial phenomenon. For two millennia, people around the world have been observing it with traditions and practices that are both religious and secular in nature. Christians celebrate Christmas Day as the anniversary of the birth of Jesus of Nazareth, a spiritual leader whose teachings form the basis of their religion";
		byte buf[] = source.getBytes();

		try (FileOutputStream fos1 = new FileOutputStream("D:\\test1\\File1.txt");
				FileOutputStream fos2 = new FileOutputStream("D:\\test1\\File2.txt");
				FileOutputStream fos3 = new FileOutputStream("D:\\test1\\File3.txt");) {

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
