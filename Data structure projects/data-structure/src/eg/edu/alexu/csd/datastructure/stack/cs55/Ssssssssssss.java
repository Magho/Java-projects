package eg.edu.alexu.csd.datastructure.stack.cs55;

import java.util.Scanner;

/**
 * @author Shiko.
 *
 */
public class Ssssssssssss {

	/**
	 */
	static void print() {
		System.out.println("1: Push");
		System.out.println("2: Pop");
		System.out.println("3: Peek");
		System.out.println("4: Get size");
		System.out.println("5: Check if empty");
		System.out.println("-1: to terminate the program");
		System.out.println(
		"============================"
		+ "============================"
		+ "==========================================");

	}
	/**
	 */
	public static final int S = 1;
	/**
	 */
	public static final int SS = 2;
	/**
	 */
	public static final int SSS = 3;
	/**
	 */
	public static final int SSSS = 4;
	/**
	 */
	public static final int SSSSS = 5;
	/**
	 * @param args the.
	 */
	public static void main(final String[] args) {

		Stack stack = new Stack();
		System.out.println("Choose one of the"
		+ " following operations : ");
		while (true) {
			print();
			Scanner input = new Scanner(System.in);
			try {
				int x = input.nextInt();

				if (x == S) {
					System.out.println("please"
					+ " insert the value to push");
					String str = new String();
					input.nextLine();
					str = input.nextLine();
					while (str.length() == 0) {
						str = input.nextLine();
					}
					stack.push(str);
				} else if (x == SS) {

					String str = (String) stack.pop();
					System.out.println(str);
				} else if (x == SSS) {

					String str = (String) stack.peek();
					System.out.println(str);
				} else if (x == SSSS) {

					int size = stack.size();
					System.out.println(size);
				} else if (x == SSSSS) {

					boolean isempty = stack.isEmpty();
					System.out.println(isempty);
				} else if (x == -1) {
					break;
				}

			} catch (Exception e) {

				System.out.println("invalid input");
			}

		}
	}
}
