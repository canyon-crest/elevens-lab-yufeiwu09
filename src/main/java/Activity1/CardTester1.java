package Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester1 {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card1 c1 = new Card1("King","Spades",13);
		Card1 c2 = new Card1("Queen","Heart",12);
		Card1 c3 = new Card1("King","Clover",13);
		System.out.println(c1.toString());
		System.out.println("card 2: " + c2.rank() + " " + c2.suit() + " " + c2.pointValue());
		System.out.println(c3.matches(c1));
	}
}
