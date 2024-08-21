package hypertekst;

import java.util.HashSet;
import java.util.Set;

import logicalcollections.LogicalList;

public abstract class Element {
	
	final String tekstinhoud;
	
	/**
	 * @representationObjects
	 * @peerObjects
	 */
	final Set<Hyperlink> referrers = new HashSet<>();
	
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
	
	/**
	 * @post | result != null
	 */
	public String getTekstinhoud() { return tekstinhoud; }
	
	/**
	 * @post | result != null
	 * @post | result.stream().allMatch(h -> h != null && h.getDoelelement() == this)
	 * 
	 * @creates | result
	 * @peerObjects
	 */
	public Set<Hyperlink> getReferrers() { return Set.copyOf(referrers); }
	
	/**
	 * @pre | getDocument() != null
	 * @mutates_proporties | getDocument(), getDocument().getElementen()
	 * @post | getDocument() == null
	 * @post | old(getDocument()).getElementen().equals(LogicalList.minus(old(getDocument()).getElementen(), this)) 
	 */
	public void verwijderUitDocument() {
		document.elementen.remove(this);
		document = null;
	}
	
	public boolean contentEquals(Element other) {
		return tekstinhoud.equals(other.tekstinhoud);
	}
	
	public abstract int getTekstueleVoorstelling(char[] buffer);
}
