package eg.edu.alexu.csd.datastructure.iceHockey.cs55;

import java.awt.Point;
import java.util.Arrays;

import eg.edu.alexu.csd.datastructure.iceHockey.IPlayersFinder;

/**
 * @author Shiko.
 */
public class Icehockey implements IPlayersFinder {
	/**
	 */
	final int k = 0;
	/**
	 */
	final int w = 4;
	/**
	 */
	final int kk = -1;
	/**
	 */
	final int s = 2;
	/**
	 */
	final int ss = 1;
	/**
	 */
	int stringRowLength = k;
	/**
	 */
	int photoLength = k;
	/**
	 */
	int maxx = kk;
	/**
	 */
	final int kkk = 10000;
	/**
	 */
	final int kkkk = 50;
	/**
	 */
	int minx = kkk;
	/**
	 */
	int maxxss = kkk;
	/**
	 */
	int saassa = kk;
	/**
	 */
	int area = k;
	/**
	 */
	int count = k;
	/**
	 */
	int arri = k;
	/**
	 */
	Point[] arr = new Point[kkkk];

	/**
	 */
	public Icehockey() {

		for (int i = 0; i < kkkk; i++) {
			arr[i] = new Point();
		}
	}
	/**
	 * @param team the.
	 * @param row the.
	 * @param column the.
	 * @param photo the.
	 * @param flag the.
	 */
	void search(
		final int team, final int row,
		final int column,
		final String[] photo, final boolean [][] flag) {

		if (!flag[row][column]
			&& photo[row].charAt(column)
			== String.valueOf(team).charAt(k)) {

			flag[row][column] = true;
			area = area + w;
			if (column * s < minx) {
				minx = column * s;
			}
			if (column * s + s > maxx) {
				maxx = column * s + s;
			}
			if (row * s < saassa) {
				saassa = row * s;
			}
			if (row * s + s > maxxss) {
				maxxss = row * s + s;
			}

			if (row - ss >= k) {
				search(team, row - ss,
				column, photo, flag);
			} // top
			if (column + ss < stringRowLength) {
				search(team, row,
				column + ss, photo, flag);
			} // right
			if (row + ss < photoLength) {
				search(team, row + ss,
				column, photo, flag);
			} // down
			if (column - ss >= k) {
				search(team, row,
				column - ss, photo, flag);
			} // left
		}
	}
	@Override
	public Point[] findPlayers(
		final String[] photo, final int team,
		final int threshold) {
		stringRowLength = k; // columns
		photoLength = k; // rows
		maxx = kk;
		minx = kkk;
		maxxss = kkk;
		saassa = kk;
		area = k;
		count = k;
		arri = k;
		stringRowLength = photo[k].length(); // columns
		photoLength = photo.length; // rows
		boolean[][] flag = new boolean[photoLength][stringRowLength];
		for (int i = k; i < photoLength; i++) {

			for (int j = k; j < stringRowLength; j++) {

				flag[i][j] = false;
			}
		}
		for (int i = k; i < photoLength; i++) {
			for (int j = k; j < stringRowLength; j++) {
				area = k;
				maxx = kk;
				final int sss = 1000;
				minx = sss;
				saassa = sss;
				maxxss = kk;

				search(team, i, j, photo, flag);
				if (area >= threshold && threshold > k) {
					arr[arri].x = (minx + maxx) / s;
					arr[arri].y = (saassa + maxxss) / s;
					arri++;
				}
			}
		}
		Point[] answer = new Point[arri];
		for (int i = k; i < answer.length; i++) {
			answer[i] = new Point();
		}
		for (int i = k; i < answer.length; i++) {

			answer[i].x = arr[i].x;
			answer[i].y = arr[i].y;
		}
		Arrays.sort(answer, new Cmp());
		return answer;
	}
}
