package eg.edu.alexu.csd.datastructure.stack.cs55;

import eg.edu.alexu.csd.datastructure.stack.IExpressionEvaluator;

/**
 * @author Shiko.
 */
public class StackApp implements IExpressionEvaluator {
	/**
	 */
	int i = 0;
	/**
	 */
	int j = 0;
	/**
	 */
	int operatorCounter = 0;
	/**
	 */
	int operandCounter = 0;
	@Override
	public String infixToPostfix(final String expression) {

		if (expression.length() == 0) {
			throw null;
		}
		char []arr = new char[expression.length()];
		Stack stack = new Stack();
		dealwithStackWhenStringIsFull(
		expression, arr, stack);
		dealwithStackWhenStringIsFinished(arr, stack);
		return saveThePostfixExpressionInString(arr);

	}
	/**
	 * Deal with Stack When String Is Full.
	 * @param expression the.
	 * @param arr the.
	 * @param stack the.
	 */
	private void dealwithStackWhenStringIsFull(
		final String expression, final char[] arr, final Stack stack) {
		for (i = 0; i < expression.length(); i++) {
			if (stack.isEmpty()) {
				testCharOfStringIfstackIsEmpty(
				expression.charAt(i),
				arr, stack);
			} else {
				testCharOfStringIfstackIsNotEmpty(
				expression.charAt(i),
				arr, stack);
			}
		}
	}
	/**
	 * Deal with Stack When String Is Finished.
	 * @param arr the.
	 * @param stack the.
	 */
	private void dealwithStackWhenStringIsFinished(
		final char[] arr, final Stack stack) {
		while (stack.size != 0) {
			if ((Character) stack.peek() == '(') {
				throw null;
			}
			arr[j++] = (Character) stack.pop();
		}
	}
	/**
	 * test Char Of String If stack Is Empty.
	 * @param c the.
	 * @param arr the.
	 * @param stack the.
	 */
	private void testCharOfStringIfstackIsEmpty(
		final char c, final char[] arr, final Stack stack) {

		testIfCharOfStringIsaNumber(c, arr);
		testIfCharOfStringIsanoperator(c, stack);
	}
	/**
	 * test Char Of String If stack Is Not Empty.
	 * @param c the.
	 * @param arr the.
	 * @param stack the.
	 */
	private void testCharOfStringIfstackIsNotEmpty(
	    final char c, final char[] arr, final Stack stack) {
		testIfCharOfStringIsaNumber(c, arr);
		searchInStackToAddPlusOrMinusoperattors(c,
		arr, stack);
		searchInStackToAddMultiplyOrDivisionoperattors(c,
		arr, stack);
		searchInStackToAddClosingTag(c, arr, stack);
		if (c == '(') {
			stack.push(c);
		}
	}
	/**
	 * test If Char Of String Is a Number.
	 * @param c the.
	 * @param arr the.
	 */
	private void testIfCharOfStringIsaNumber(
		final char c, final char []arr) {
		if (c != '-' && c != '+' && c != '/'
			&& c != '*' && c != ' '
			&& c != '(' && c != ')') {
			operandCounter++;
			arr[j++] = c;
		}
	}
	/**
	 * test If Char Of String Is an operator.
	 * @param c the.
	 * @param stack the.
	 */
	private void testIfCharOfStringIsanoperator(
		final char c, final Stack stack) {
		if (c == '+' || c == '-'
			|| c == '*' || c == '/') {
			operatorCounter++;
			stack.push(c);
		}
		if (c == '(' || c == ')') {
			stack.push(c);
		}
	}
	/**
	 * Search In Stack To Add Plus Or Minus operators.
	 * @param c the.
	 * @param arr the.
	 * @param stack the.
	 */
	private void searchInStackToAddPlusOrMinusoperattors(
	final char c, final char[] arr,
	final Stack stack) {
		if (c == '+' || c == '-') {
			operatorCounter++;
			char test = (Character) stack.peek();
			while (test == '-'
				|| test == '*'
				|| test == '/'
				|| test == '+') {
				arr[j++] = (Character) stack.pop();
				if (stack.size != 0) {
					test = (Character) stack.peek();
				} else {
					break;
				}
			}
			stack.push(c);
		}
	}
	/**
	 * Search In Stack To Add Multiply Or Division operators.
	 * @param c the.
	 * @param arr the.
	 * @param stack the.
	 */
	private void
	searchInStackToAddMultiplyOrDivisionoperattors(
	final char c, final char[] arr, final Stack stack) {
		if (c == '*' || c == '/') {
			operatorCounter++;
			char test = (Character) stack.peek();
			while (test == '/' || test == '*') {
				arr[j++] = (Character) stack.pop();
				if (stack.size != 0) {
					test = (Character) stack.peek();
				} else {
					break;
				}
			}
			stack.push(c);
		}
	}
	/**
	 * Search In Stack To Add Closing Tag.
	 * @param c the.
	 * @param arr the.
	 * @param stack the.
	 */
	private void searchInStackToAddClosingTag(
		final char c, final char[] arr,
		final Stack stack) {
		if (c == ')') {
			while ((Character) stack.peek() != '(') {
				if (stack.size == 0) {
					throw null;
				}
				arr[j++] = (Character) stack.pop();
			}
			stack.pop();
		}
	}
	/**
	 * Save The Postfix Expression In String.
	 * @param arr the.
	 * @return the.
	 */
	private String saveThePostfixExpressionInString(
		final char [] arr) {
		i = 0;
		char [] postfixExpressionArray
		= new char[2 * j - 1];
		for (int k = 0; k < j; k++) {
			postfixExpressionArray[i++] = arr[k];
			if (i < 2 * j - 1) {
				postfixExpressionArray[i++] = ' ';
			}
		}
		String postfixExpressionString =
		new String(postfixExpressionArray);
		j = 0;
		if (operandCounter != operatorCounter + 1) {
			throw null;
		}
		return postfixExpressionString;
	}
	@Override
	public int evaluate(final String expression) {
		Stack stack = new Stack();
		String sssssssss = "";
		for (int k = 0; k < expression.length(); k++) {
			if (expression.charAt(k) != ' ') {
				sssssssss +=
				expression.charAt(k);
			} else {
				if (sssssssss != "") {
					testIfCharOfStringIsaNumber(
					sssssssss, stack);
					testIfCharOfStringIsaOperator(
					sssssssss, stack);
				}
				sssssssss = "";
			}
		}
		if (expression.charAt(expression.length() - 1)
			!= ' ') {
			testIfCharOfStringIsaNumber(
			sssssssss, stack);
			testIfCharOfStringIsaOperator(
			sssssssss, stack);
			sssssssss = "";
		}
		i = 0;
		j = 0;
		return (int) Float.parseFloat((String)
		stack.peek());
	}
	/**
	 * test If Char Of String Is a Number.
	 * @param c the.
	 * @param stack the.
	 */
	private void testIfCharOfStringIsaNumber(
		final String c, final Stack stack) {
		if (c.charAt(0) != '+' && c.charAt(0)
			!= '-' && c.charAt(0) != '*'
			&& c.charAt(0) != '/') {
			stack.push(c);
		}
	}
	/**
	 * test If Char Of String Is a operator.
	 * @param c the.
	 * @param stack the.
	 */
	private void testIfCharOfStringIsaOperator(
		final String c, final Stack stack) {
		if (c.charAt(0) == '+' || c.charAt(0) == '-'
			|| c.charAt(0) == '*'
			|| c.charAt(0) == '/') {
			applyTheOperatorIfTheStackIfItISFound(
			c, stack);
		}
	}
	/**
	 * Apply The Operator If The Stack If It IS Found.
	 * @param c the.
	 * @param stack the.
	 */
	private void applyTheOperatorIfTheStackIfItISFound(
		final String c, final Stack stack) {
		if (stack.size >= 2) {
			float firstnumberInt =
			testTheValueOfTheTopElementOfTheStack(stack);
			float secondnumberInt =
			testTheValueOfTheTopElementOfTheStack(stack);
			make(
			c, stack, firstnumberInt, secondnumberInt);
		} else {
			throw null;
		}
	}
	/**
	 * test The Value Of The Top Element Of The Stack.
	 * @param stack the.
	 * @return the.
	 */
	private float testTheValueOfTheTopElementOfTheStack(
		final Stack stack) {
		float firstnumberInt = 0;
		if (stack.peek().getClass().
			equals(String.class)) {
			firstnumberInt = Float.parseFloat(
			(String) stack.peek());
		}
		stack.pop();
		return firstnumberInt;
	}
	/**
	 * Make An Operation On The Stack When Operator Is Found.
	 * @param c the.
	 * @param stack the.
	 * @param firstnumberInt the.
	 * @param secondnumberInt the.
	 */
	private void make(
		final String c, final Stack stack,
		final float firstnumberInt,
		final float secondnumberInt) {
		float sum = 0;
		if (c.charAt(0) == '+') {
			sum = secondnumberInt + firstnumberInt;
		} else if (c.charAt(0) == '-') {
			sum = secondnumberInt - firstnumberInt;
		} else if (c.charAt(0) == '*') {
			sum = secondnumberInt * firstnumberInt;
		} else if (c.charAt(0) == '/') {
			sum = secondnumberInt / firstnumberInt;
		}
		String ss = Float.toString(sum);
		stack.push(ss);
	}
}
