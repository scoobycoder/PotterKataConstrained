package potter;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PotterKataTest {

	private Cashier underTest;
	private ArrayList<PotterBook> books;

	@Before public void setup() {
		books = new ArrayList<PotterBook>();
	}
	
	@Test
	public void storyTest() {
		PotterBook book1 = new PotterBook("Stone");
		PotterBook book2 = new PotterBook("Chamber");
		PotterBook book3 = new PotterBook("Prisoner");
		PotterBook book4 = new PotterBook("Goblet");
		PotterBook book5 = new PotterBook("Order");

		book1.purchase();
		book1.purchase();
		book2.purchase();
		book2.purchase();
		book3.purchase();
		book3.purchase();
		book4.purchase();
		book5.purchase();
		
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		
		underTest = new Cashier(books);
		assertThat(underTest.calc(), is(51.20));
	}
	
	@Test
	public void firstBookShouldCostEightDollars() {
		PotterBook book = new PotterBook("Stone");
		book.purchase();
		books.add(book);
		
		underTest = new Cashier(books);
		
		assertThat(underTest.calc(), is(8.00));
	}
	
	@Test
	public void buyingTwoDifferentBooksGivesFivePercentDiscount() {
		PotterBook book1 = new PotterBook("Stone");
		PotterBook book2 = new PotterBook("Chamber");
		
		book1.purchase();
		book2.purchase();
		
		books.add(book1);
		books.add(book2);
		
		underTest = new Cashier(books);
		
		assertThat(underTest.calc(), is(15.96));
	}
	
	
	
}
