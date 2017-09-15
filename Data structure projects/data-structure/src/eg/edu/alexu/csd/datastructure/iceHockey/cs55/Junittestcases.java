package eg.edu.alexu.csd.datastructure.iceHockey.cs55;


import static org.junit.Assert.assertEquals;

import java.awt.Point;

import org.junit.Test;

import eg.edu.alexu.csd.datastructure.iceHockey.IPlayersFinder;

/**
 * @author Shiko.
 *
 */
public class Junittestcases {
	/**
	 */
	final int l = 0;
	/**
	 */
	final int ll = 1;
	/**
	 */
	final int lll = 2;
	/**
	 */
	final int llll = 3;
	/**
	 */
	final int lllll = 4;
	/**
	 */
	final int llllll = 5;
	/**
	 */
	final int lllllll = 6;
	/**
	 */
	final int llllllll = 7;
	/**
	 */
	final int lllllllll = 8;
	/**
	 */
	final int llllllllll = 9;
	/**
	 * the.
	 */
	@Test
	public void test1() {
		final int k = 3;
		final Point [] idealAnswer = new Point[k];

		for (int i = l; i < idealAnswer.length; i++) {
			idealAnswer[i] =  new Point();
		}
		final int moh = 4;
		final int moha = 13;
		final int mohb = 9;
		final int mohc = 14;
		final int mohd = 2;
		int mohD = moh;
		idealAnswer[l].x = moh;
		idealAnswer[l].y = ++mohD;
		idealAnswer[ll].x = moha;
		idealAnswer[ll].y = mohb;
		idealAnswer[lll].x = mohc;
		idealAnswer[lll].y = mohd;
		Icehockey test1 = new Icehockey();

		IPlayersFinder test = (IPlayersFinder) test1;
		String[] photo = {"33JUBU33", "3U3O4433",
		"O33P44NB", "PO3NSDP3", "VNDSD333", "OINFD33X" };
		final int mohdaa = 3;
		final int mohaaa = 16;

		Point[] answer = test.findPlayers(photo, mohdaa, mohaaa);

		for (int i = l; i < idealAnswer.length; i++) {
			assertEquals(idealAnswer[l].x, answer[l].x);
			assertEquals(idealAnswer[l].y, answer[l].y);
		}
	}
	/**
	 * the.
	 */
	@Test
	public void test2() {
		final int k = 6;
		final Point [] idealAnswer = new Point[k];

		for (int i = l; i < idealAnswer.length; i++) {
			idealAnswer[i] = new Point();
		}
		final int moh = 3;
		final int mohss = 4;
		final int mohsss = 5;
		final int mohd = 16;
		final int mohs = 9;
		final int mohw = 8;
		int moha = mohd;
		int mohD = moh;
		idealAnswer[l].x = moh;
		idealAnswer[l].y = mohw;
		idealAnswer[ll].x = ++mohD;
		idealAnswer[ll].y = mohd;
		idealAnswer[lll].x = ++mohD;
		idealAnswer[lll].y = --mohD;
		idealAnswer[moh].x = mohd;
		idealAnswer[moh].y = moh;
		idealAnswer[mohss].x = mohd;
		idealAnswer[mohss].y = ++moha;
		idealAnswer[mohsss].x = ++moha;
		idealAnswer[mohsss].y = mohs;
		Icehockey test1 = new Icehockey();

		IPlayersFinder test = (IPlayersFinder) test1;
		String[] photo = {"44444H44S4", "K444K4L444",
				"4LJ44T44XH", "444O4VIF44", "44C4D4U444",
				"4V4Y4KB4M4", "G4W4HP4O4W",
				"4444ZDQ4S4", "4BR4Y4A444", "4G4V4T4444" };
		Point[] answer = test.findPlayers(photo, mohD, mohd);

		for (int i = l; i < idealAnswer.length; i++) {
			assertEquals(idealAnswer[l].x, answer[l].x);
			assertEquals(idealAnswer[l].y, answer[l].y);
		}
	}
	/**
	 * the.
	 */
	@Test
	public void test4() {
		final int k = 2;

		final Point [] idealAnswer = new Point[k];

		for (int i = l; i < idealAnswer.length; i++) {
			idealAnswer[i] = new Point();
		}
		final int mohw = 5;
		final int mohe = 1;
		int moha = mohw;
		idealAnswer[l].x = mohw;
		idealAnswer[l].y = mohw;
		idealAnswer[ll].x = mohw;
		idealAnswer[ll].y = mohw;
		moha--;
		moha--;
		Icehockey test1 = new Icehockey();

		IPlayersFinder test = (IPlayersFinder) test1;
		String[] photo = {"11111", "1AAA1",
				"1A1A1", "1AAA1", "11111" };
		Point[] answer = test.findPlayers(photo, mohe, moha);

		for (int i = l; i < idealAnswer.length; i++) {
			assertEquals(idealAnswer[l].x, answer[l].x);
			assertEquals(idealAnswer[l].y, answer[l].y);
		}
	}
	/**
	 * the.
	 */
	@Test
	public void empty() {
		final int k = 0;

		final Point [] idealAnswer = new Point[k];

		for (int i = l; i < idealAnswer.length; i++) {
			idealAnswer[i] = new Point();
		}
		Icehockey test1 = new Icehockey();

		IPlayersFinder test = (IPlayersFinder) test1;
		String[] photo = {"AAAAA", "aAAAA",
				"aAsAs", "sAAAq", "sqssq" };
		final int mohw = 1;
		final int mohe = 3;

		Point[] answer = test.findPlayers(photo, mohw, mohe);

		for (int i = l; i < idealAnswer.length; i++) {
			assertEquals(idealAnswer[l].x, answer[l].x);
			assertEquals(idealAnswer[l].y, answer[l].y);
		}
	}
	/**
	 * the.
	 */
	@Test
	public void full() {
		final int k = 1;

		final Point [] idealAnswer = new Point[k];

		for (int i = l; i < idealAnswer.length; i++) {
			idealAnswer[i] = new Point();
		}
		final int mohe = 3;
		final int mohew = 4;

		idealAnswer[l].x = mohe;
		idealAnswer[l].y = mohe;
		Icehockey test1 = new Icehockey();
		IPlayersFinder test = (IPlayersFinder) test1;
		String[] photo = {"333", "333", "333", };

		Point[] answer = test.findPlayers(photo, mohe, mohew);

		for (int i = 0; i < idealAnswer.length; i++) {
			assertEquals(idealAnswer[l].x, answer[l].x);
			assertEquals(idealAnswer[l].y, answer[l].y);
		}
	}
	/**
	 * the.
	 */
	@Test
	public void inside() {
		final int k = 3;
		final int kkk = 1;

		final Point [] idealAnswer = new Point[k];

		for (int i = l; i < idealAnswer.length; i++) {
			idealAnswer[i] = new Point();
		}
		final int kk = 9;

		idealAnswer[l].x = kk;
		idealAnswer[l].y = kk;
		idealAnswer[ll].x = kk;
		idealAnswer[ll].y = kk;
		idealAnswer[lll].x = kk;
		idealAnswer[lll].y = kk;

		Icehockey test1 = new Icehockey();

		IPlayersFinder test = (IPlayersFinder) test1;
		String[] photo = {"111111111", "1CCWDCFW1",
				"1F11111W1", "1F1AAA1A1",
				"1W1A1A1G1", "1E1AAA1U1",
				"1Y11111L1", "1LGRMFWF1", "111111111" };
		Point[] answer = test.findPlayers(photo, kkk, k);

		for (int i = l; i < idealAnswer.length; i++) {
			assertEquals(idealAnswer[l].x, answer[l].x);
			assertEquals(idealAnswer[l].y, answer[l].y);
		}
	}
	/**
	 * the.
	 */
	@Test
	public void edgecheck() {
		final int k = 3;

		final Point [] idealAnswer = new Point[k];

		for (int i = l; i < idealAnswer.length; i++) {
			idealAnswer[i] = new Point();
		}
		final int moh = 1;
		int mohD = moh;
		final int mohs = 5;
		final int mohss = 9;
		int mohDs = mohs;
		idealAnswer[l].x = mohD;
		idealAnswer[l].y = mohDs;
		idealAnswer[ll].x = mohDs;
		idealAnswer[ll].y = mohDs;
		idealAnswer[lll].x = mohss;
		idealAnswer[lll].y = mohDs;

		Icehockey test1 = new Icehockey();

		IPlayersFinder test = (IPlayersFinder) test1;
		String[] photo = {"A444A", "4S4S4",
				"4D4D4", "4F4F4", "A444A" };
		final int ff = 12;
		Point[] answer = test.findPlayers(photo, lllll, ff);

		for (int i = l; i < idealAnswer.length; i++) {
			assertEquals(idealAnswer[l].x, answer[l].x);
			assertEquals(idealAnswer[l].y, answer[l].y);
		}
	}
	/**
	 * the.
	 */
	@Test
	public void allInOne() {
		final int k = 1;

		final Point [] idealAnswer = new Point[k];

		for (int i = l; i < idealAnswer.length; i++) {
			idealAnswer[i] = new Point();
		}
		final int moh = 7;
		int mohD = moh;
		idealAnswer[l].x = mohD;
		idealAnswer[l].y = --mohD;
		Icehockey test1 = new Icehockey();
		IPlayersFinder test = (IPlayersFinder) test1;
		String[] photo = {"2222222", "22DDD22", "2DDDDD2",
				"2DDDDD2", "22DDD22", "22DDD22", };
		final int moha = 2;
		final int mohb = 3;
		Point[] answer = test.findPlayers(photo, moha, mohb);
		for (int i = l; i < idealAnswer.length; i++) {
			assertEquals(idealAnswer[l].x, answer[l].x);
			assertEquals(idealAnswer[l].y, answer[l].y);
		}
	}
	/**
	 * the.
	 */
	@Test
	public void random() {
		final int k = 10;
		final Point [] idealAnswer = new Point[k];
		for (int i = 0; i < idealAnswer.length; i++) {
			idealAnswer[i] = new Point();
		}
		final int moh = 1;
		int mohD = moh;
		idealAnswer[l].x = mohD;
		idealAnswer[l].y = mohD;
		idealAnswer[ll].x = mohD;
		mohD++;
		idealAnswer[ll].y = ++mohD;
		idealAnswer[lll].x = --mohD;
		idealAnswer[lll].y = mohD;
		idealAnswer[llll].x = mohD;
		mohD++;
		idealAnswer[llll].y = ++mohD;
		idealAnswer[lllll].x = --mohD;
		mohD--;
		idealAnswer[lllll].y = --mohD;
		mohD++;
		idealAnswer[llllll].x = ++mohD;
		idealAnswer[llllll].y = mohD;
		idealAnswer[lllllll].x = ++mohD;
		mohD--;
		idealAnswer[lllllll].y = --mohD;
		mohD++;
		idealAnswer[llllllll].x = ++mohD;
		idealAnswer[llllllll].y = ++mohD;
		idealAnswer[lllllllll].x = ++mohD;
		idealAnswer[lllllllll].y = ++mohD;
		idealAnswer[llllllllll].x = moh;
		mohD--;
		idealAnswer[llllllllll].y = --mohD;
		Icehockey test1 = new Icehockey();
		IPlayersFinder test = (IPlayersFinder) test1;
		String[] photo = {"5C5D5", "D5E5T", "5O5D5", "I5U5Y" };
		final int moha = 5;
		final int mohb = 3;
		Point[] answer = test.findPlayers(photo, moha, mohb);
		for (int i = l; i < idealAnswer.length; i++) {
			assertEquals(idealAnswer[l].x, answer[l].x);
			assertEquals(idealAnswer[l].y, answer[l].y);
		}
	}
}
