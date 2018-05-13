package controller;
import model.Movie;
import model.NewRelease;

public class Rental {
	private Movie movie;
	private int daysRented;

	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}
	
	public double getAmount() {
		return movie.getRentalPrice(daysRented);
	}
	
	public int getFrequentRenterPoints()
	{
		if ((movie instanceof NewRelease) && daysRented > 1) return 2;
		return 1;
	}
}