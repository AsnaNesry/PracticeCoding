package nio_io_example;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {

	public static void main(String[] args) {
		// obtain a channel to a file within a try-with-resource block
		try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("D:\\test1\\File4.txt"),
				StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {

			ByteBuffer mBuf = ByteBuffer.allocate(50);

			// write some bytes to the buffer
			for (int incr = 0; incr < 26; incr++) {
				mBuf.put((byte) ('A' + incr));
			}
			// reset the buffer so that it can be written
			mBuf.flip();
			// writer the buffer to output file
			fChan.write(mBuf);
		} catch (InvalidPathException e) {
			System.out.println("Path error..." + e);

		} catch (IOException e) {
			System.out.println("I/O exception error...." + e);
			System.exit(0);
		} // end of try catch
	}// end of main method

}// end of class
