package CSSE;

/**
 * 
 * @author rmorales
 *
 */

public abstract class WeddingPackage {
	private String description ="a wedding package";
	private int numberOfGuests=0;

	public int getNumberOfGuests() {
		return numberOfGuests;
	}

	public void setNumberOfGuests(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}

	public String getDescription () {
		return description;
	}
	
	public abstract double cost();
}
