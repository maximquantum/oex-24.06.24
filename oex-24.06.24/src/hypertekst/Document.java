package hypertekst;

import java.util.ArrayList;
import java.util.List;

public class Document {
	
	/**
	 * @representationObject
	 * @peerObjects
	 */
	List<Element> elementen = new ArrayList<>();
	
	
	/**
	 * @peerObjects
	 */
	public List<Element> getElementen() { return List.copyOf(elementen); }
	
	/**
	 * @post | getElementen().isEmpty()
	 */
	public Document() {}

}
