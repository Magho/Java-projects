package eg.edu.alexu.csd.datastructure.linkedList.cs59_55;

/**
 * @author Shiko.
 *
 */
public class DNode {
	/**
	 */
	final int k = 0;
	/**
	 * the.
	 */
	private Object value;
	/**
	 * the.
	 */
	private DNode next;
	/**
	 * the.
	 */
	private DNode prev;
	/**
	 * the.
	 */
	public int coff = k;
	/**
	 * the.
	 */
	public int exp = k;

	/**
	 * @param val the.
	 */
	DNode(final Object val) {
		value = val;
		next = null;
		prev = null;
	}

	/**
	 * @param c the.
	 * @param e the.
	 */
	DNode(final int c, final int e) {
		coff = c;
		exp = e;
		next = null;
		prev = null;
	}

	/**
	 * @param val the.
	 * @param c the.
	 * @param e the.
	 */
	DNode(final Object val, final int c, final int e) {
		coff = c;
		exp = e;
		value = val;
		next = null;
		prev = null;
	}

	/**
	 * @param n the.
	 */
	void setNext(final DNode n) {
		next = n;
	}

	/**
	 * @param n the.
	 */
	void setPrev(final DNode n) {
		prev = n;
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
	 * @return the.
	 */
	DNode getNext() {
		return next;
	}

	/**
	 * @return the.
	 */
	DNode getPrev() {
		return prev;
	}

	/** return true if the x Node.
	 * is greater than the Node */
	/**
	 * @param x the.
	 * @return the.
	 */
	boolean compareTo(final DNode x) {
		return x.getData().equals(value);
	}
}
