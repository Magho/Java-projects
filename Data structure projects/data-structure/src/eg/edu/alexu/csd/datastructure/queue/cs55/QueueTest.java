package eg.edu.alexu.csd.datastructure.queue.cs55;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Shiko.
 *
 */
public class QueueTest {

	/**
	 */
	public static final int S = 20000;
	/**
	 */
	public static final int SS = 10000;

	/**
	 * the.
	 */
	@Test
	public void testenQueuelongDequeuEnQueue() {
		QueueLinkedList qwe = new QueueLinkedList();
		QueueArray qweee = new QueueArray(SS);

		for (int i = 0; i < SS; i++) {

			qwe.enqueue(i);
			qweee.enqueue(i);
		}

		for (int i = 0; i < SS; i++) {

			assertEquals(i, qwe.dequeue());
			assertEquals(i, qweee.dequeue());
		}
	}
	/**
	 * the.
	 */
	@Test
	public void testEmpty() {
		final int num = 23;
		QueueLinkedList qwe = new QueueLinkedList();
		QueueArray qweee = new QueueArray(num);

		for (int i = 0; i < num; i++) {

			qwe.enqueue(i);
			qweee.enqueue(i);
		}

		for (int i = 0; i < num - 1; i++) {

			qwe.dequeue();
			qweee.dequeue();
		}
		qweee.dequeue();
		boolean t = true;
		boolean f = false;
		assertEquals(f, qwe.isEmpty());
		assertEquals(t, qweee.isEmpty());
	}
	/**
	 * the.
	 */
	@Test
	public void testSize() {
		final int num = 23;
		QueueLinkedList qwe = new QueueLinkedList();
		QueueArray qweee = new QueueArray(num);

		for (int i = 0; i < num; i++) {

			qwe.enqueue(i);
			qweee.enqueue(i);
		}

		for (int i = 0; i < num; i++) {
			qwe.dequeue();
		}

		final int t = 0;
		assertEquals(t, qwe.size());
		assertEquals(num, qweee.size());
	}
	/**
	 * the.
	 */
	@Test(timeout = S)
	public void testTime() {
		final int num = 85000;
		QueueLinkedList qwe = new QueueLinkedList();
		QueueArray qweee = new QueueArray(num);

		for (int i = 0; i < num; i++) {

			qwe.enqueue(i);
			qweee.enqueue(i);
		}

		for (int i = 0; i < num; i++) {

			assertEquals(i, qwe.dequeue());
			assertEquals(i, qweee.dequeue());
		}
	}
}
