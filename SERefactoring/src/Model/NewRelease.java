package Model;

public class NewRelease extends Movie {

	public NewRelease(String title) {
		super(title);
	}
	
	@Override
	public double getRentalPrice(int daysRented)
	{
		return daysRented * 3;
	}

}
