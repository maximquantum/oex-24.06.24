package hypertekst;

import java.util.Arrays;

public class Tekstelement extends Element {
	
	/**
	 * @pre | tekstinhoud != null
	 * @post | getTekstinhoud().equals(tekstinhoud)
	 */
	public Tekstelement(String tekstinhoud) {
		super(tekstinhoud);
	}
	
	/**
	 * @throws IllegalArgumentException | buffer == null
	 * @mutates | buffer
	 * @inspects | this
	 * @post | result == getTekstinhoud().length()
	 * @post | result <= buffer.length || Arrays.equals(buffer, old(buffer.clone()))
	 * @post | buffer.length < result || Arrays.equals(buffer, result, buffer.length, old(buffer.clone()), result, buffer.length)
	 * @post | buffer.length < result || Arrays.equals(buffer, 0, result, getTekstinhoud().toCharArray(), 0, result)
	 */
	@Override
	public int getTekstueleVoorstelling(char[] buffer) {
		if (buffer == null)
			throw new IllegalArgumentException("`Buffer` is null");
		
		if (buffer.length >= tekstinhoud.length()) {
			tekstinhoud.getChars(0, tekstinhoud.length(), buffer, 0);
		}
		return tekstinhoud.length();
	}
}
