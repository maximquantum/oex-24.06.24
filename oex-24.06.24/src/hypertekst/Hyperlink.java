package hypertekst;

import logicalcollections.LogicalSet;

public class Hyperlink extends Element {
	
	
	/**
	 * @peerObject
	 */
	Element doelelement;
	
	/**
	 * @peerObject
	 */
	public Element getDoelelement() { return doelelement; } 
	
	/**
	 * @pre | tekstinhoud != null
	 * @post | getTekstinhoud().equals(tekstinhoud)
	 */
	public Hyperlink(String tekstinhoud) {
		super(tekstinhoud);
	}
	
	/**
	 * @pre | getDoelelement() == null
	 * @pre | doelelement != null
	 * @mutates_proporties | getDoelelement(), doelelement.getReferrers()
	 * @post | getDoelelement() == doelelement
	 * @post | doelelement.getReferrers().equals(LogicalSet.plus(old(doelelement.getReferrers()), this))
	 */
	public void setDoelelement(Element doelelement) {
		this.doelelement = doelelement;
		doelelement.referrers.add(this);
	}
}
