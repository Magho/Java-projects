package eg.edu.alexu.csd.datastructure.linkedList.cs59_55;

import java.util.Scanner;

/**
 * @author Shiko.
 *
 */
public class Sssssssssss {


	/**
	 *  the.
	 */
	public static void print() {

		System.out.println("Please choose an action");
		System.out.println("-----------------------");
		System.out.println("1 - Set a polynomial variable");
		System.out.println("2 - Print the value of "
		+ "a polynomial variable");
		System.out.println("3 - Add two polynomials");
		System.out.println("4 - Subtract two polynomials");
		System.out.println(" 5 - Multiply two "
		+ "polynomials");
		System.out.println("6 - Evaluate a "
		+ "polynomial at some point");
		System.out.println("7 - Clear a"
		+ " polynomial variable");
		System.out.println("-1 - to finish the programme");
		System.out.println("==============="
		+ "====================="
		+ "================================");
	}

	/**
	 * @param arg the.
	 */
	public static void main(final String[] arg) {
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
		Poly app = new Poly();
		while (true) {
			print();
			try {
				Scanner input = new Scanner(System.in);
				int x = input.nextInt();
				if (x == ll) {
					System.out.println(
					"Insert the variable "
					+ "name : A , B or C");
					char poly = input.next().charAt(l);
					System.out.println(
					"insert num of terms");
					int rows = input.nextInt();
					System.out.println(
					"Insert the polynomial "
					+ "terms in the form :");
					System.out.println(
					"( coeff1 , exponent1 ) ,"
					+ "( coeff2 , exponent2 ) , ..");
					int[][] terms = new int[rows][lll];
					for (int i = l; i < rows; i++) {
						System.out.println(
						"isert coeff");
						terms[i][l] = input.nextInt();
						System.out.println("exponent");
						terms[i][1] = input.nextInt();
					}
					app.setPolynomial(poly, terms);
					System.out.println("Polynomial "
					+ poly + " is set");
				} else if (x == lll) {
					System.out.println(
						"Insert the variable name "
					+ ": A , B or C");
					char poly = input.next().charAt(l);
					String str = app.print(poly);
					System.out.println(str);
				} else if (x == llll) {
					System.out.println(
					"Insert the variable name "
					+ ": A , B or C");
					char poly1 = input.next().charAt(l);
					System.out.println(
					"Insert the variable name :"
					+ " A , B or C");
					char poly2 = input.next().charAt(l);
					int[][] arr = app.add(poly1, poly2);
					app.setPolynomial('R', arr);
					String str = app.print('R');
					System.out.println(str);
				} else if (x == lllll) {
					System.out.println(
					"Insert the variable name "
					+ ": A , B or C");
					char poly1 = input.next().charAt(l);
					System.out.println(
					"Insert the variable name"
					+ " : A , B or C");
					char poly2 = input.next().charAt(l);
					int[][] arr =
					app.subtract(poly1, poly2);
					app.setPolynomial('R', arr);
					String str = app.print('R');
					System.out.println(str);
				} else if (x == llllll) {
					System.out.println(
					"Insert the variable name"
					+ " : A , B or C");
					char poly1 = input.next().charAt(l);
					System.out.println(
					"Insert the variable name"
					+ " : A , B or C");
					char poly2 = input.next().charAt(l);
					int[][] arr =
					app.multiply(poly1, poly2);
					app.setPolynomial('R', arr);
					String str = app.print('R');
					System.out.println(str);
				} else if (x == lllllll) {
					System.out.println(
					"Insert the variable name"
					+ " : A , B or C");
					char poly = input.next().charAt(l);
					System.out.println(
					"enter value to evaluate"
					+ " the polynomial around");
					int value = input.nextInt();
					float answer =
					app.evaluatePolynomial(
					poly, value);
					System.out.println(
					"The answer is : " + answer);
				} else if (x == llllllll) {

					System.out.println(
					"Insert the variable name"
					+ " : A , B or C");
					char poly =
					input.next().charAt(l);
					app.clearPolynomial(poly);

				} else if (x == -1) {

					break;
				}
			} catch (Exception e) {

				System.out.println(
				"invaid input");
			}
		}
	}
}
