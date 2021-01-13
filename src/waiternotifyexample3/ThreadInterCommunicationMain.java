package waiternotifyexample3;

public class ThreadInterCommunicationMain {

	public static void main(String[] args) {
		Book book = new Book("My First Book...");
		BookReader infyReader = new BookReader(book);
		BookReader ustReader = new BookReader(book);
		BookReader ibmReader = new BookReader(book);

		Thread infyThread = new Thread(infyReader, "Infosys");
		Thread ustThread = new Thread(ustReader, "UST");
		Thread ibmThread = new Thread(ibmReader, "IBM");

		infyThread.start();
		ustThread.start();
		ibmThread.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// bookwriter thread which will notify once book get completed
		BookWriter bookWriter = new BookWriter(book);
		Thread bookWriterThread = new Thread(bookWriter);
		bookWriterThread.start();

	}// end of main method

}// end of class
