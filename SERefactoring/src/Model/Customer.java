package Model;

import java.util.ArrayList;
import java.util.List;

import Controller.Rental;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<Rental>();

	public Customer(String newname) {
		name = newname;
	};

	public void addRental(Rental arg) {
		rentals.add(arg);
	};

	public String getName() {
		return name;
	};

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		String result = "Rental Record for " + this.getName() + "\n";
		result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

		for (Rental rental : rentals) {
			totalAmount += rental.getAmount();
			frequentRenterPoints += rental.getFrequentRenterPoints();
			result += "\t" + rental.getMovie().getTitle() + "\t" + "\t" + rental.getDaysRented() + "\t"
					+ String.valueOf(rental.getAmount()) + "\n";
		}
		
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
		return result;

	}

}
