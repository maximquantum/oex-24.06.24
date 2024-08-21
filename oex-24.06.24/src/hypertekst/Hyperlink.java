package hypertekst;

public class Hyperlink extends Element {
	
	
	/**
	 * @peerObject
	 */
	Element doelelement;
	
	/**
	 * @pre | tekstinhoud != null
	 * @post | getTekstinhoud().equals(tekstinhoud)
	 */
	public Hyperlink(String tekstinhoud) {
		super(tekstinhoud);
	}
	
	/**
	 * @peerObject
	 */
	public Element getDoelelement() { return doelelement; } 

}
