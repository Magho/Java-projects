package eg.edu.alexu.csd.datastructure.queue.cs55;
import eg.edu.alexu.csd.datastructure.queue.IArrayBased;
import eg.edu.alexu.csd.datastructure.queue.IQueue;
/**
 * @author Shiko.
 */
public class QueueArray implements IQueue, IArrayBased {
	/**
	 */
	Object []arr;
	/**
	 */
	public int r = 0;
	/**
	 */
	public int f = 0;
	/**
	 * @param n the.
	 */
	QueueArray(final int n) {

		arr = new Object[n + 1];
	}
	@Override
	public void enqueue(final Object item) {

		if (item == null) {
			throw null;
		} else if (size() == arr.length - 1) {
			throw null;
		} else {
			arr[r] = item;
			r = (r + 1) % arr.length;
		}
	}
	@Override
	public Object dequeue() {
		if (f == r) {
			throw null;
		} else {

			Object ss = arr[f];
			arr[f] = null;
			f = (f + 1) % arr.length;
			return ss;
		}
	}
	@Override
	public boolean isEmpty() {

		return f == r;
	}
	@Override
	public int size() {
		return (arr.length - f + r) % arr.length;
	}
}
