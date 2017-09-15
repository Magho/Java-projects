package eg.edu.alexu.csd.datastructure.stack.cs55;

import eg.edu.alexu.csd.datastructure.stack.IStack;

/**
 * @author Shiko.
 *
 */
public class Stack implements IStack {
	/**
	 * .
	 */
	public Doublenode head;
	/**
	 * .
	 */
	public Doublenode tail;
	/**
	 * .
	 */
	public int size;
	/**
	 * the.
	 */
	public Stack() {
		head = null;
		tail = null;
		size = 0;
	}
	@Override
	public void add(
	final int index, final Object element) {

		if (index < 0 || index > size) {
			throw null;
		} else if (index == 0 && head == null) {
			addElementWhenHeadEquallNull(element);
		} else if (index == 0 && head != null) {
			addElementWhenHeadIsNotNull(element);
		} else if (index == size - 1) {
			addElementatBeforeTheEnd(element);
		} else if (index == size) {
			addElementatTheEnd(element);
		} else {
			addElementInparicularPlace(index, element);
		}
	}
	/**
	 * add Element When Head Equal Null when size equal zero.
	 * @param element the.
	 */
	void addElementWhenHeadEquallNull(
		final Object element) {
		Doublenode node = new Doublenode();
		node.value = element;
		node.next = null;
		node.prev = null;
		head = node;
		tail = node;
		size++;
	}
	/**
	 * add Element at Before The End when index equal size - 1.
	 * @param element the.
	 */
	void addElementatBeforeTheEnd(final Object element) {

		Doublenode node = new Doublenode();
		node.value = element;
		tail.prev.next = node;
		node.prev = tail.prev;
		tail.prev = node;
		node.next = tail;
		size++;
	}
	/**
	 * add Element When Head Is Not.
	 * Null when size equal zero.
	 * @param element the.
	 */
	void addElementWhenHeadIsNotNull(
		final Object element) {

		Doublenode node = new Doublenode();
		node.value = element;
		node.next = head;
		head.prev = node;
		node.prev = null;
		head = node;
		size++;
	}
	/**
	 * add Element at The End when index equal size.
	 * @param element the.
	 */
	public void addElementatTheEnd(
		final Object element) {

		Doublenode node = new Doublenode();
		node.value = element;
		node.next = null;
		tail.next = node;
		node.prev = tail;
		tail = node;
		size++;
	}
	/**
	 * add Element In particular Place at index user decide.
	 * @param index the.
	 * @param element the.
	 */
	void addElementInparicularPlace(
		final int index, final Object element) {

		Doublenode trace = new Doublenode();
		trace = head;
		for (int i = 0; i < index - 1; i++) {
			trace = trace.next;
		}
		Doublenode node = new Doublenode();
		node.value = element;
		trace.next.prev = node;
		node.next = trace.next;
		trace.next = node;
		node.prev = trace;
		size++;
	}
	@Override
	public Object pop() {
		Object value = null;
		if (size == 0) {
			throw null;
		} else if (size == 1) {
			value = popLastElementInTheStack();
		} else {
			value = popOtherElementInTheStack();
		}
		return value;
	}
	/**
	 * pop Last Element In The Stack when size equal one.
	 * @return the.
	 */
	Object popLastElementInTheStack() {
		Object  value = head.value;
		head = null;
		tail = null;
		size--;
		return value;
	}
	/**
	 * pop Element In The Stack at any case.
	 *  except size equal one.
	 * @return the.
	 */
	Object popOtherElementInTheStack() {
		Object value = tail.value;
		tail.prev.next = null;
		tail = tail.prev;
		size--;
		return value;
	}
	@Override
	public Object peek() {
		if (size == 0) {
			throw null;
		} else {
			return tail.value;
		}
	}
	@Override
	public void push(final Object element) {

		if (size == 0) {
			addElementWhenHeadEquallNull(element);
		} else {
			addElementatTheEnd(element);
		}
	}
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	@Override
	public int size() {

		return size;
	}
}
