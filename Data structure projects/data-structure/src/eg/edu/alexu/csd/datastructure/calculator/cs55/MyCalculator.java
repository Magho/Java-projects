package eg.edu.alexu.csd.datastructure.calculator.cs55;

import eg.edu.alexu.csd.datastructure.calculator.ICalculator;

/**
 * @author Shiko.
 *
 */
public class MyCalculator implements ICalculator {
	/**
	 * @return answer The.
	 * @param x
	 *            The.
	 * @param y
	 *            The.
	 */
	public int add(final int x, final int y) {
		return x + y;
	}

	/**
	 * @return answer The.
	 * @param x
	 *            The.
	 * @param y
	 *            The.
	 */
	public float divide(final int x, final int y) {
		final int ww = 0;
		final int www = 00;
		if (y == ww) {
			System.out.println("infinity");
			return www;
		} else {
			return (float) x / (float) y;
		}
	}

}
