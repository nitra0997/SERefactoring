package model;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class MovieTest {

	private Movie regularMovie = new Movie("Star Wars: The Last Jedi");
	private Movie newRelease = new NewRelease("Deadpool 2");
	private Movie childrensMovie = new ChildrensMovie("Frozen");

	@Test
	public void regularMoviePriceIsEqualForFirstTwoDays() {
		assertThat(regularMovie.getRentalPrice(0), is(2.0));
		assertThat(regularMovie.getRentalPrice(1), is(2.0));
		assertThat(regularMovie.getRentalPrice(2), is(2.0));
	}

	@Test
	public void regularMovieCostIncreasesAfterSecondDay() {
		assertThat(regularMovie.getRentalPrice(3), is(3.5));
		assertThat(regularMovie.getRentalPrice(4), is(5.0));
	}

	@Test
	public void newReleaseAlwaysCosts3PerDayRented() {
		assertThat(newRelease.getRentalPrice(0), is(0.0));
		assertThat(newRelease.getRentalPrice(1), is(3.0));
		assertThat(newRelease.getRentalPrice(2), is(6.0));
	}

	@Test
	public void childrensMoviePriceIsEqualForThreeTwoDays() {
		assertThat(childrensMovie.getRentalPrice(0), is(1.5));
		assertThat(childrensMovie.getRentalPrice(1), is(1.5));
		assertThat(childrensMovie.getRentalPrice(2), is(1.5));
		assertThat(childrensMovie.getRentalPrice(3), is(1.5));
	}

	@Test
	public void childrensMovieCostIncreasesAfterThirdDay() {
		assertThat(childrensMovie.getRentalPrice(4), is(3.0));
		assertThat(childrensMovie.getRentalPrice(5), is(4.5));
	}

}
