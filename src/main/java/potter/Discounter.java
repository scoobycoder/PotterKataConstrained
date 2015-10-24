package potter;

import java.util.ArrayList;

public class Discounter {

	public double determineDiscount(ArrayList<PotterBook> books) {
		if (books.size() > 4)
			return 0.75;
		else if (books.size() > 3)
			return 0.80;
		else if (books.size() > 2)
			return 0.90;
		else if (books.size() > 1)
			return 0.95;
		else
			return 1.0;
	}

}
