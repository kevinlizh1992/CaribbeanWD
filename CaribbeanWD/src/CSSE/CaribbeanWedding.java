package CSSE;
/**
 * 
 * @author kzhli
 *
 */
public class CaribbeanWedding {

	public static void main(String[] args) {
		WeddingPackage wp = new Passion();
		System.out.println(wp.getDescription() + " cost $" +
		 wp.cost());
		
		//TODO: Instantiate a new wp2 of a Soul package with DJ, Photo, and video recording
		WeddingPackage wp2 = new Soul();
		wp2 = new DjMusic(wp2);
		wp2 = new PhotoService(wp2);
		wp2 = new VideoRecording(wp2);
		System.out.println(wp.getDescription() + " cost $" + wp2.cost());
		
		//TODO: Instantiate a new wp3 of a Deluxe package with private dinner on the beach, and 20 guests
		WeddingPackage wp3 = new Deluxe();
		wp2 = new PrivateDinnerBeach(wp2, 20);
		System.out.println(wp.getDescription() + " cost $" + wp2.cost() + );
	
		
		
	}

}
