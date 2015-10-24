package potter;

import java.util.ArrayList;

public class Discounter {

	public double determineDiscount(ArrayList<PotterBook> books) {
		if (books.size() > 1)
			return 0.005;
		else
			return 0.00;
	}

}
