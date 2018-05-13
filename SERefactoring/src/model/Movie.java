package model;

public class Movie {
	
	private String title;

	public Movie(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	};
	
	public double getRentalPrice(int daysRented)
	{
		if (daysRented > 2)
		{
			return 2 + (daysRented - 2) * 1.5;
		}
		return 2;
	}
}