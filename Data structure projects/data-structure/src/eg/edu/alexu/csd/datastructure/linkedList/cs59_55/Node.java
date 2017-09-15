package eg.edu.alexu.csd.datastructure.linkedList.cs59_55;

/**
 * @author Shiko.
 *
 */
class Node {
	/**
	 * .
	 */
	private Object value;
	/**
	 * .
	 */
	private Node next;
	/**
	 * .
	 */
	public int coff = 0, exp = 0;

	/**
	 * @param c the.
	 * @param e the.
	 */
	Node(final int c, final int e) {
		coff = c;
		exp = e;
	}

	/**
	 * @param val the.
	 */
	Node(final Object val) {
		value = val;
		next = null;
	}

	/**
	 * @param val the.
	 * @param c the.
	 * @param e the.
	 */
	Node(final Object val, final int c, final int e) {
		value = val;
		coff = c;
		exp = e;
	}

	/**
	 * @param s the.
	 */
	Node(final Node s) {
		coff = s.coff;
		exp = s.exp;
	}

	/**
	 * @param n the.
	 */
	void setNext(final Node n) {
		next = n;
	}

	/**
	 * @return the.
	 */
	Object getData() {
		return value;
	}

	/**
	 * @param val the.
	 */
	void setData(final Object val) {
		value = val;
	}

	/**
	 * @return  the.
	 */
	Node getNext() {
		return next;
	}

	/** return true if the x Node is greater than the Node. */
	/**
	 * @param x the.
	 * @return the.
	 */
	boolean compareTo(final Node x) {
		return x.getData().equals(value);
	}
}
