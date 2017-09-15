package eg.edu.alexu.csd.datastructure.hangman.cs55;

import java.util.Random;

import eg.edu.alexu.csd.datastructure.hangman.IHangman;

/**
 * @author Shiko.
 *
 */
public class Hangmangame implements IHangman {

	/**
	 */
	final int k = 0;
	/**
	 * .
	 */
	int count = k;
	/**
	 * .
	 */
	int maxcount = k;
	/**
	 * .
	 */
	String the;
	/**
	 * .
	 */
	String hashed;
	/**
	 * .
	 */
	String []ch;

	@Override

	public void setDictionary(final String[] s) {

		ch = s;
	}

	@Override
	public String selectRandomSecretWord() {

		if (ch == null) {
			return null;
		} else {

			String word = null;
			Random rnd = new Random();
			int number = rnd.nextInt(ch.length);

			word = ch[number];
			the = word;
			hashed = word;

			char []array = new char[hashed.length()];
			for (int i = k; i < the.length(); i++) {

				array[i] = '-';

			}

			hashed = new String(array);

			return word;
		}
	}

	@Override
	public String guess(final Character c) {

		char a = Character.toUpperCase(c);
		char b = Character.toLowerCase(c);

		char []array = new char[the.length()];
		array = hashed.toCharArray();
		int flag = k;
		for (int i = k; i < the.length(); i++) {

			if (c == null) {
				hashed = new String(array);

				return hashed;
			} else if (a == the.charAt(i)
				|| b == the.charAt(i)) {
				array[i] = a;
				flag = 1;

			}
		}
		if (flag == k) {
			count++;
		}
		if (count >= maxcount) {

			return null;
		}
		if (the.equals(hashed)) {
			return null;
		}
		hashed = new String(array);
		return hashed;
	}

	@Override
	public void setMaxWrongGuesses(final Integer max) {
		maxcount = max;
	}
}
