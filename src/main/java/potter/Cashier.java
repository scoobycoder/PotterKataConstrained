package potter;

import java.util.ArrayList;

public class Cashier {

	private ArrayList<PotterBook> books;
	private double cost;

	public Cashier(ArrayList<PotterBook> books) {
		this.books = books;
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
			cost += 8.00;
	}

}
