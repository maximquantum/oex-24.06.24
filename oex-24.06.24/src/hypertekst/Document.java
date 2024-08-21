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
	 * 
	 * @post | result != null
	 * @post | result.stream().allMatch(e -> e != null && e.getDocument() == this)
	 */
	public List<Element> getElementen() { return List.copyOf(elementen); }
	
	/**
	 * @post | getElementen().isEmpty()
	 */
	public Document() {}

}
