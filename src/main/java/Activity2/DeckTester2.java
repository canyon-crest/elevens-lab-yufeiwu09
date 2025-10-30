package Activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester2 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		int[] values = new int[] {13,1,12};
		String[] ranks = new String[] {"King","Ace","Queen"};
		String[] suits = new String[] {"Spades", "Heart", "Diamond","Club"};
		Deck2 deck = new Deck2(ranks,suits,values);
		System.out.println(deck.isEmpty());
		System.out.println(deck.size());
		Card2 c1 = deck.deal();
		Card2 c2 = deck.deal();
		Card2 c3 = deck.deal();
		Card2 c4 = deck.deal();
		Card2 c5 = deck.deal(); //null
		System.out.println(c1.toString() + " " + c2.toString() + " " + c3.toString() + " " + c4.toString());
		System.out.println(deck.isEmpty());
		System.out.println(deck.size());
	}
}
