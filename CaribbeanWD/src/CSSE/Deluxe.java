package CSSE;
/**
 * 
 * @author rmorales
 *
 */
public class Deluxe extends WeddingPackage {
	
	public Deluxe() {
		setNumberOfGuests(15);
	}
	@Override
	public double cost() {
		return 2499;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "caribbean deluxe";
	}

}
