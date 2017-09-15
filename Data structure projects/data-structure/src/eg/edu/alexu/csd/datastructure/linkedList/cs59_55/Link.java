package eg.edu.alexu.csd.datastructure.linkedList.cs59_55;
/**
 * @author Shiko.
 */
class Point {
	/**
	 */
	final int k = 0;
	/**
	 */
	protected int coff, exp;
	/**
	 */
	protected Point next;
	/**
	 */
	public Point() {
		next = null;
		coff = k;
		exp = k;
	}
	/**
	 * @param c the.
	 * @param e the.
	 * @param n the.
	 */
	public Point(final int c, final int e, final Point n) {
		coff = c;
		exp = e;
		next = n;
	}
	/**
	 */
	public void setNeg() {
		coff *= -1;
	}
	/**
	 * @param n the.
	 */
	public void setLinkNext(final Point n) {
		next = n;
	}
	/**
	 * @return the.
	 */
	public Point getLinkNext() {
		return next;
	}
	/**
	 * @param c the.
	 * @param e the.
	 */
	public void setData(final int c, final int e) {
		coff = c;
		exp = e;
	}
	/**
	 * @return the.
	 */
	public int getCoff() {
		return coff;
	}
	/**
	 * @return the.
	 */
	public int getExp() {
		return exp;
	}
	/**
	 * @param val the.
	 * @return the.
	 */
	public float evaluate(final float val) {
		float ans = coff * (float)
		java.lang.Math.pow(val, exp);
		return ans;
	}
	/**
	 * @param x the.
	 */
	public void swapValue(final Point x) {
		int tCoff = this.coff;
		int tExp = this.exp;
		this.coff = x.getCoff();
		this.exp = x.getExp();
		x.setData(tCoff, tExp);
	}
}
/**
 * @author Shiko the.
 */
public class Link {
	/**
	 */
	final int k = 0;
	/**
	 */
	private Point start;
	/**
	 */
	private Point end;
	/**
	 */
	public int size;

	/**
	 */
	public Link() {
		start = null;
		end = start;
		size = k;
	}
	/**
	 * @param l the.
	 */
	public void clear(final Link l) {
		start = null;
		end = null;
		size = k;
	}

	/**
	 * @param nptr the.
	 */
	public void insertAtStart(final Point nptr) {
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else {
			nptr.setLinkNext(start);
			start = nptr;
		}
	}

	/* Function to insert an element at end */
	/**
	 * @param nptr the.
	 */
	public void insertAtEnd(final Point nptr) {
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else {
			end.setLinkNext(nptr);
			end = nptr;
		}
	}

	/* Function to insert an element at position */
	/**
	 * @param nptr the.
	 * @param pos the.
	 */
	public void insertAtPos(final Point nptr, final int pos) {
		Point ptr = start;
		if (pos == k) {
			nptr.setLinkNext(start);
			start = nptr;
			size++;
			return;
		}
		if (pos == size) {
			end.setLinkNext(nptr);
			end = nptr;
			size++;
			return;
		}
		for (int i = 1; i < size; i++) {
			if (i == pos) {
				Point tmp = ptr.getLinkNext();
				ptr.setLinkNext(nptr);
				nptr.setLinkNext(tmp);
				break;
			}
			ptr = ptr.getLinkNext();
		}
		size++;
	}

	/* Function to delete an element at position */

	/**
	 * @param pos the.
	 */
	public void deleteAtPos(final int pos) {
		if (pos == k) {
			start = start.getLinkNext();
			size--;
			return;
		}
		if (pos == size - 1) {
			Point s = start;
			Point t = start;
			while (s != end) {
				t = s;
				s = s.getLinkNext();
			}
			end = t;
			end.setLinkNext(null);
			size--;
			return;
		}
		Point ptr = start;
		// pos = pos - 1;
		for (int i = 1; i < size - 1; i++) {
			if (i == pos) {
				Point tmp = ptr.getLinkNext();
				tmp = tmp.getLinkNext();
				ptr.setLinkNext(tmp);
				break;
			}
			ptr = ptr.getLinkNext();
		}
		size--;
	}

	/**
	 * @param index the.
	 * @return the.
	 */
	public Point getPoint(final int index) {
		if (index == k) {
			return start;
		}
		if (index == k) {
			return end;
		}
		Point p = start;
		for (int i = k; i < size; i++) {
			if (i == index) {
				return p;
			}
			p = p.getLinkNext();
		}
		throw null;
	}

	/**
	 * @param a the.
	 * @param b the.
	 * @return the.
	 */
	Link conCat(final Link a, final Link b) {
		Link f = new Link();
		int i = k;
		while (i < a.size) {
			Point p = new Point(a.getPoint(i).getCoff(),
			a.getPoint(i).getExp(), null);
			f.insertAtEnd(p);
			i++;
		}
		i = k;
		while (i < b.size) {
			Point p = new Point(b.getPoint(i).getCoff(),
			b.getPoint(i).getExp(), null);
			f.insertAtEnd(p);
			i++;
		}

		return f;
	}

	/**
	 * @param x the.
	 * @param l the.
	 */
	void loadArray(final int[][] x, final Link l) {
		for (int i = k; i < x.length; i++) {
			x[i][k] = l.getPoint(i).getCoff();
			x[i][1] = l.getPoint(i).getExp();
		}
	}

	/**
	 * @param lll the.
	 */
	void negative(final Link lll) {
		int i = k;
		while (i < size) {
			lll.getPoint(i).setNeg();
			i++;
		}
	}

	/**
	 * @param l the.
	 */
	void deleteZero(final Link l) {
		Point x;
		x = start;
		int i = k;
		while (x != null) {
			if (x.getCoff() == k) {
				l.deleteAtPos(i);
			}
			i++;
			x = x.getLinkNext();
		}
	}
	/**
	 */
	public void display() {
		System.out.print("\nSingly Linked List = ");
		if (size == k) {
			System.out.print("empty\n");
			return;
		}
		if (start.getLinkNext() == null) {
			System.out.println(start.getCoff()
			+ "X^(" + start.getExp() + ")");
			return;
		}
		Point ptr = start;
		System.out.print(start.getCoff()
		+ "X^(" + start.getExp() + ")" + ",");
		ptr = start.getLinkNext();
		while (ptr.getLinkNext() != null) {
			System.out.print(ptr.getCoff()
			+ "X^(" + ptr.getExp() + ")" + ",");
			ptr = ptr.getLinkNext();
		}
		System.out.print(ptr.getCoff()
		+ "X^(" + ptr.getExp() + ")" + "\n");
	}
}
