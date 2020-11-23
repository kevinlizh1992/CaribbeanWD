package CSSE;
/**
 * 
 * @author rmorales
 *
 */
public class Passion extends WeddingPackage {
	
	public Passion() {
		setNumberOfGuests(10);
	}
	@Override
	public double cost() {
		return 899;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "caribbean passion";
	}
	
}
