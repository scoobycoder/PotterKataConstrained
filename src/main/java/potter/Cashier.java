package potter;

import java.util.ArrayList;

public class Cashier {

	private ArrayList<PotterBook> books;
	private double cost;
	private Discounter discounter;

	public Cashier(ArrayList<PotterBook> books, Discounter discounter) {
		this.books = books;
		this.discounter = discounter;
	}

	public double calc() {
		sumAllBooks();
		return cost;
	}

	private void sumAllBooks() {
		for(PotterBook book : books)
			sumCostOfCurrentBook(book);
	}

	private void sumCostOfCurrentBook(PotterBook book) {
		for(int i = 0; i < book.count(); i++)
			cost += 8.00 - percentageToApply();
	}

	private double percentageToApply() {
		return 8.00 * discounter.determineDiscount(books);
	}

}
