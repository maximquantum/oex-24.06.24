package hypertekst;

public class Tekstelement extends Element {
	
	/**
	 * @pre | tekstinhoud != null
	 * @post | getTekstinhoud().equals(tekstinhoud)
	 */
	public Tekstelement(String tekstinhoud) {
		super(tekstinhoud);
	}
}
