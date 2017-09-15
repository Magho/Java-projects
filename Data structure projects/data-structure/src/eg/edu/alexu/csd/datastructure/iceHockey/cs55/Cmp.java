package eg.edu.alexu.csd.datastructure.iceHockey.cs55;

import java.awt.Point;
import java.util.Comparator;

/**
 * @author Shiko.
 *
 */
public class Cmp implements Comparator<Point> {
	/**
	 */
	final int k = 0;
	/**
	 */
	final int kk = -1;
	/**
	 */
	final int kkk = 1;
	@Override
	public int compare(final Point a, final Point b) {
		if (a.x < b.x) {
			return kk;
		} else if (a.x > b.x) {
			return kkk;
		} else {
			return k;
		}
	}
}
