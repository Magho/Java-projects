package eg.edu.alexu.csd.datastructure.linkedList.cs59_55;

import eg.edu.alexu.csd.datastructure.linkedList.IPolynomialSolver;

/**
 * @author Shiko.
 *
 */
public class Poly implements IPolynomialSolver {

	/**
	 * .
	 */
	private Link a = new Link();
	/**
	 * .
	 */
	private Link b = new Link();
	/**
	 * .
	 */
	private Link c = new Link();
	/**
	 * .
	 */
	private Link l = new Link();

	/**
	 * @param poly the.
	 * @return the.
	 */
	boolean check(final char poly) {
		return poly == 'A'
		|| poly == 'B'
		|| poly == 'C'
		|| poly == 'R';
	}

	/**
	 * @param poly the.
	 * @return the.
	 */
	Link choose(final char poly) {
		switch (poly) {
		case 'A':
			return a;
		case 'B':
			return b;
		case 'C':
			return c;
		case 'R':
			return l;
		default:
			return null;
		}
	}

	/**
	 * @param e  the.
	 * @param x the.
	 */
	void loadTerms(final Link e, final int[][] x) {

		for (int i = 0; i < x.length; i++) {
			Point p = new Point(x[i][0], x[i][1], null);
			e.insertAtStart(p);
		}
	}
	@Override

	public void setPolynomial(final char poly, final int[][] terms) {
		if (!check(poly) || terms == null) {
			throw null;
		}
		Link x = choose(poly);
		for (int i = 0; i < terms.length; i++) {
			for (int j = i; j < terms.length; j++) {
				if (terms[i][1] < terms[j][1]
					|| terms[j][1] < 0) {
					throw null;
				}
			}
		}
		loadTerms(x, terms);
	}
	@Override

	public String print(final char poly) {
		if (!check(poly)) {
			return null;
		}
		Link x = choose(poly);
		if (x == null) {
			return "";
		}
		try {
			StringBuilder str = new StringBuilder();
			int i = 0;
			int r = x.getPoint(0).getCoff();
			str.append(r);
			str.append("X^");
			r = x.getPoint(0).getCoff();
			str.append(r);
			for (i = 1; i < x.size; i++) {
				if (x.getPoint(i).getCoff() > 0) {
					str.append('+');
					str.append(x.getPoint(i).getCoff());
				} else {
					str.append(x.getPoint(i).getCoff());
				}
				if (x.getPoint(i).getExp() != 0) {
					str.append("X^");
					str.append(x.getPoint(i).getExp());
				}
			}
			return str.toString();
		} catch (Exception e) {
			return null;
		}
	}
	@Override

	public void clearPolynomial(final char poly) {
		if (!check(poly)) {
			throw null;
		}
		Link x = choose(poly);
		x.clear(x);
	}
	@Override

	public float evaluatePolynomial(final char poly, final float value) {
		if (!check(poly)) {
			throw null;
		}
		Link t = choose(poly);
		if (t.size == 0) {
			throw null;
		}
		float ans = 0;
		int i = 0;
		while (i < t.size) {
			ans += t.getPoint(i).evaluate(value);
			i++;
		}

		return ans;
	}
	@Override

	public int[][] add(final char poly1, final char poly2) {
		if (!check(poly1) || !check(poly2)) {
			throw null;
		}
		Link l1, l2;
		l1 = choose(poly1);
		l2 = choose(poly2);
		if (l1.size == 0 || l2.size == 0) {
			throw null;
		}
		l = l1.conCat(l1, l2);
		int i = 0;
		int j = 0;
		while (i < l.size) {
			j = i;
			while (j < l.size) {
				if (l.getPoint(i).getExp()
					< l.getPoint(j).getExp()) {
					l.getPoint(i).swapValue(
					l.getPoint(j));
				}
				j++;
			}
			i++;
		}
		i = 0;
		while (i < l.size && l.getPoint(i).getLinkNext() != null) {
			if (l.getPoint(i).getExp()
				== l.getPoint(i + 1).getExp()) {
				int aaa = l.getPoint(i).getCoff()
					+ l.getPoint(i + 1).getCoff();
				// System.out.println(c);
				l.getPoint(i).setData(aaa,
				l.getPoint(i).getExp());
				l.deleteAtPos(i + 1);
			}
			i++;
		}
		i = 0;
		while (i < l.size) {
			j = i + 1;
			while (j < l.size) {
				if (l.getPoint(i).getExp()
					== l.getPoint(j).getExp()) {
					int sss = l.getPoint(i).getCoff()
					+ l.getPoint(j).getCoff();
					// System.out.println(c);
					l.getPoint(i).setData(sss,
					l.getPoint(i).getExp());
					l.deleteAtPos(j);
				}
				j++;
			}
			i++;
		}
		// R.display();
		l.deleteZero(l);
		int[][] arr = new int[l.size][2];
		l.loadArray(arr, l);
		return arr;
	}
	@Override
	public int[][] subtract(
		final char poly1, final char poly2) {
		if (!check(poly1) || !check(poly2)) {
			throw null;
		}
		Link l1, l2;
		l1 = choose(poly1);
		l2 = choose(poly2);
		if (poly1 == poly2) {
			int[][] x = {{0, 0 }};
			return x;
		}

		if (l1.size == 0 || l2.size == 0) {
			throw null;
		}

		l2.negative(l2);
		// l2.display();
		int[][] arr = add(poly1, poly2);
		l2.negative(l2);
		// l2.display();
		return arr;
	}
	@Override

	public int[][] multiply(
		final char poly1, final char poly2) {
		if (!check(poly1) || !check(poly2)) {
			throw null;
		}
		Link l1, l2;
		l1 = choose(poly1);
		l2 = choose(poly2);
		if (l1.size == 0 || l2.size == 0) {
			throw null;
		}
		l.clear(l);
		int i = 0;
		int j = 0;
		while (i < l1.size) {
			Point y =
			new Point(l1.getPoint(i).getCoff(),
			l1.getPoint(i).getExp(), null);
			j = 0;
			while (j < l2.size) {
				Point x =
				new Point(l2.getPoint(j).getCoff(),
				l2.getPoint(j).getExp(), null);
				int csss = x.getCoff() * y.getCoff();
				int e = x.getExp() + y.getExp();
				Point sss = new Point(csss, e, null);
				l.insertAtEnd(sss);
				j++;
			}
			i++;
		}
		i = 0;
		while (i < l.size) {
			j = i;
			while (j < l.size) {
				if (l.getPoint(i).getExp()
					< l.getPoint(j).getExp()) {
					l.getPoint(i).swapValue(
					l.getPoint(j));
				}
				j++;
			}
			i++;
		}
		i = 0;
		while (i < l.size) {
			j = i + 1;
			while (j < l.size) {
				if (l.getPoint(i).getExp()
					== l.getPoint(j).getExp()) {
					int sss = l.getPoint(i).getCoff()
					+ l.getPoint(j).getCoff();
					// System.out.println(c);
					l.getPoint(i).setData(sss,
					l.getPoint(i).getExp());
					l.deleteAtPos(j);
				}
				j++;
			}
			i++;
		}
		i = 0;
		while (i < l.size) {
			j = i + 1;
			while (j < l.size) {
				if (l.getPoint(i).getExp()
					== l.getPoint(j).getExp()) {
					int sss = l.getPoint(i).getCoff()
					+ l.getPoint(j).getCoff();
					l.getPoint(i).setData(sss,
					l.getPoint(i).getExp());
					l.deleteAtPos(j);
				}
				j++;
			}
			i++;
		}
		l.deleteZero(l);
		int[][] arr = new int[l.size][2];
		l.loadArray(arr, l);
		return arr;
	}
}
