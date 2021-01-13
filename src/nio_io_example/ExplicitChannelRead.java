package nio_io_example;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead {

	public static void main(String[] args) {

		int count;
		Path filePath = null;
		// obtain path to a file
		try {
			filePath = Paths.get("D:\\test1\\File3.txt");

		} catch (InvalidPathException e) {
			System.out.println("path error....." + e);
			return;
		}
		// obtain a channel to that file within try-with-resource block
		try (SeekableByteChannel sChan = Files.newByteChannel(filePath)) {
			// allocate a buffer
			ByteBuffer nBuf = ByteBuffer.allocate(128);
			do {
				// reads bytes into the buffer a buffer
				count = sChan.read(nBuf);

				// stops when end of file reached

				if (count != -1) {
					nBuf.rewind();

					// read bytes from the buffer and show them on the screen as the characters

					for (int incr = 0; incr < count; incr++) {
						System.out.print((char) nBuf.get());
					} // end of for loop
				} // end of if
			} while (count != -1);
			System.out.println();
		} catch (IOException e) {
			System.out.println("IO Exception occured" + e);
		}

	}

}
