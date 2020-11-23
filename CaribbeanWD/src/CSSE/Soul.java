package CSSE;
/**
 * 
 * @author rmorales
 *
 */

public class Soul extends WeddingPackage {
	
	public Passion() {
		setNumberOfGuests(10);
	}
	
	@Override
	public double cost() {
		return 1499;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "caribbean soul";
	}
}
