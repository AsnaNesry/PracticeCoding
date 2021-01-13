package nio_io_example;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedChannelReadExample {

	public static void main(String[] args) {
		try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("D:\\test1\\File3.txt"),
				StandardOpenOption.WRITE, StandardOpenOption.READ)) {

			long fSize = fChan.size();

			MappedByteBuffer nBuf = fChan.map(MapMode.PRIVATE, 0, fSize);
			for (int incr = 0; incr < fSize; incr++) {
				System.out.print((char) nBuf.get());
			} // end of forloop

		} catch (InvalidPathException e) {
			System.out.println("path error" + e);
		} catch (IOException e) {
			System.out.println("path error" + e);
		}

	}

}
