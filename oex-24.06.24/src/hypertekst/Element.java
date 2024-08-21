package hypertekst;

public abstract class Element {
	
	final String tekstinhoud;
	
	/**
	 * @peerObject
	 */
	Document document;
	
	Element(String tekstinhoud) {
		this.tekstinhoud = tekstinhoud;
	}
	
	/**
	 * @peerObject
	 */
	public Document getDocument() { return document; }

}
