package waiternotifyexample3;

public class BookWriter implements Runnable {

	Book book;

	public BookWriter(Book book) {
		super();
		this.book = book;
	}

	public void run() {
		synchronized (book) {
			System.out.println("Author is starting book :" + book.getTitle());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			book.setCompleted(true);
			System.out.println("book has been completed now");
			book.notify();
			System.out.println("Notify the reader.....");

		} // end of sychronized block
	}// end of rum method

}// end of class
