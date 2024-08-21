package hypertekst;

import java.util.ArrayList;
import java.util.List;

import logicalcollections.LogicalList;

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
	
	/**
	 * @pre | element != null
	 * @pre | element.getDocument() == null
	 * @mutates_proporties | getElementen(), element.getDocument()
	 * @post | getElementen().equals(LogicalList.plus(old(getElementen()), element))
	 */
	public void addElement(Element element) {
		elementen.add(element);
		element.document = this;
	}

}
