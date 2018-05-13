package controller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import model.ChildrensMovie;
import model.Movie;
import model.NewRelease;

public class RentalTest {

	private Movie regularMovie = new Movie("Star Wars: The Last Jedi");
	private Movie newRelease = new NewRelease("Deadpool 2");
	private Movie childrensMovie = new ChildrensMovie("Frozen");

	@Test
	public void regularRentalGrantsOneFrequentRenterPoint() {
		Rental regularRental = new Rental(regularMovie, 1);
		assertThat(regularRental.getFrequentRenterPoints(), is(1));
	}
	
	@Test
	public void childrensMovieRentalGrantsOneFrequentRenterPoint() {
		Rental childrensMovieRental = new Rental(childrensMovie, 1);
		assertThat(childrensMovieRental.getFrequentRenterPoints(), is(1));
	}
	
	@Test
	public void newReleaseRentalOfTwoDaysOrLongerGrantsTwoFrequentRenterPoints()
	{
		Rental newReleaseRental = new Rental(newRelease, 2);
		assertThat(newReleaseRental.getFrequentRenterPoints(), is(2));
	}
	
	@Test
	public void newReleaseRentalOfZeroDaysGrantsOneFrequentRenter()
	{
		Rental newReleaseShortRental = new Rental(newRelease, 1);
		assertThat(newReleaseShortRental.getFrequentRenterPoints(), is(1));
	}

}
