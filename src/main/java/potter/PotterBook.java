package potter;

public class PotterBook {
	
	private int bookCount;
	private String bookName;

	public PotterBook(String bookName) {
		this.bookName = bookName;
	}

	public void purchase() {
		this.bookCount += 1;
	}

	public int count() {
		return bookCount;
	}
	
}
