package eg.edu.alexu.csd.datastructure.queue.cs55;

import eg.edu.alexu.csd.datastructure.queue.ILinkedBased;
import eg.edu.alexu.csd.datastructure.queue.IQueue;
import eg.edu.alexu.csd.datastructure.stack.cs55.Stack;

/**
 * @author Shiko.
 *
 */
public class QueueLinkedList implements IQueue, ILinkedBased {

	/**
	 * .
	 */
	Stack stack = new Stack();
	@Override

	public void enqueue(final Object item) {
		stack.add(0, item);
	}
	@Override

	public Object dequeue() {
		return stack.pop();
	}
	@Override

	public boolean isEmpty() {

		return stack.isEmpty();
	}
	@Override

	public int size() {

		return stack.size();
	}
}
