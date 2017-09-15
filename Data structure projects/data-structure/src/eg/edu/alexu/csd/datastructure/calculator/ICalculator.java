package eg.edu.alexu.csd.datastructure.calculator;

/**
 * @author Shiko.
 *
 */
public interface ICalculator {

	/**
	 * Adds given two numbers
	 * 
	 * @param x
	 *            first number
	 * @param y
	 *            second number
	 * @return the sum of the two numbers
	 */
	int add(final int x, final int y);

	/**
	 * Divids two numbers
	 * 
	 * @param x
	 *            first number
	 * @param y
	 *            second number
	 * @return the division result
	 */
	float divide(final int x, final int y);

}
