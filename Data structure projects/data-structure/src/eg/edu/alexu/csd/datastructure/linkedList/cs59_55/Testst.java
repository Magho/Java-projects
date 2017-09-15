package eg.edu.alexu.csd.datastructure.linkedList.cs59_55;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Shiko.
 *
 */
public class Testst {
	/**
	 * the.
	 */
	@Test
	public void testadd() {

		DoubleLinkedList testDouble =
		new DoubleLinkedList();
		SinglyLinkedList testSingle =
		new SinglyLinkedList();

		final int realsize = 8;
		for (int i = 0; i < realsize; i++) {

			testDouble.add(i, i);
			testSingle.add(i, i);
		}
		int doublesize = testDouble.size();
		int singlesize = testSingle.size();
		assertEquals(doublesize, realsize);
		assertEquals(singlesize, realsize);

	}
	/**
	 * the.
	 */
	@Test
	public void testaddlast() {

		DoubleLinkedList testDouble =
		new DoubleLinkedList();
		SinglyLinkedList testSingle =
		new SinglyLinkedList();

		final int realsize = 8;
		for (int i = 0; i < realsize; i++) {

			testDouble.add(i);
			testSingle.add(i);
		}
		int doublesize = testDouble.size();
		int singlesize = testSingle.size();
		assertEquals(doublesize, realsize);
		assertEquals(singlesize, realsize);

	}
	/**
	 * the.
	 */
	@Test
	public void testget() {

		DoubleLinkedList testDouble =
		new DoubleLinkedList();
		SinglyLinkedList testSingle =
		new SinglyLinkedList();

		final int realsize = 8;
		int i = 0;
		for (i = 0; i < realsize; i++) {

			testDouble.add(i);
			testSingle.add(i);
		}
		int index = i - 1;
		int doublesize = (Integer) testDouble.get(index);
		int singlesize = (Integer) testSingle.get(index);
		assertEquals(doublesize, index);
		assertEquals(singlesize, index);

	}
	/**
	 * the.
	 */
	@Test
	public void testset() {

		DoubleLinkedList testDouble = new DoubleLinkedList();
		SinglyLinkedList testSingle = new SinglyLinkedList();

		final int realsize = 8;
		int i = 0;
		for (i = 0; i < realsize; i++) {

			testDouble.add(i);
			testSingle.add(i);
		}
		int index = i - 1;
		final int newvalue = 12;
		testDouble.set(index, newvalue);
		testSingle.set(index, newvalue);
		int doublesize = (Integer) testDouble.get(index);
		int singlesize = (Integer) testSingle.get(index);
		assertEquals(doublesize, newvalue);
		assertEquals(singlesize, newvalue);

	}
	/**
	 * the.
	 */
	@Test
	public void testclaer() {

		DoubleLinkedList testDouble = new DoubleLinkedList();
		SinglyLinkedList testSingle = new SinglyLinkedList();

		final int realsize = 8;
		int j = 0;
		for (int i = 0; i < realsize; i++) {

			testDouble.add(i);
			testSingle.add(i);
		}
		testDouble.clear();
		testSingle.clear();
		int doublesize = testDouble.size();
		int singlesize = testSingle.size();
		assertEquals(doublesize, j);
		assertEquals(singlesize, j);

	}

	/**
	 * the.
	 */
	@Test
	public void testisempty() {

		DoubleLinkedList testDouble = new DoubleLinkedList();
		SinglyLinkedList testSingle = new SinglyLinkedList();

		final int realsize = 8;
		boolean j = true;
		for (int i = 0; i < realsize; i++) {

			testDouble.add(i);
			testSingle.add(i);
		}
		testDouble.clear();
		testSingle.clear();
		boolean doublesize = testDouble.isEmpty();
		boolean singlesize = testSingle.isEmpty();
		assertEquals(doublesize, j);
		assertEquals(singlesize, j);

	}

	/**
	 * the.
	 */
	@Test
	public void testremove() {

		DoubleLinkedList testDouble = new DoubleLinkedList();
		SinglyLinkedList testSingle = new SinglyLinkedList();

		final int realsize = 8;
		int i = 0;
		for (i = 0; i < realsize; i++) {

			testDouble.add(i);
			testSingle.add(i);
		}
		int index = i - 1;
		testDouble.remove(index);
		testSingle.remove(index);
		int newindex = index - 1;
		int doublesize = (Integer) testDouble.get(newindex);
		int singlesize = (Integer) testSingle.get(newindex);
		assertEquals(doublesize, newindex);
		assertEquals(singlesize, newindex);

	}
	/**
	 * the.
	 */
	@Test
	public void testsize() {

		DoubleLinkedList testDouble = new DoubleLinkedList();
		SinglyLinkedList testSingle = new SinglyLinkedList();

		final int realsize = 8;
		int i = 0;
		for (i = 0; i < realsize; i++) {

			testDouble.add(i);
			testSingle.add(i);
		}
		int index = i - 1;
		testDouble.remove(index);
		testSingle.remove(index);
		int newindex = realsize - 1;
		int doublesize = testDouble.size();
		int singlesize = testSingle.size();
		assertEquals(doublesize, newindex);
		assertEquals(singlesize, newindex);

	}

	/**
	 * the.
	 */
	@Test
	public void testcontains() {

		DoubleLinkedList testDouble = new DoubleLinkedList();
		SinglyLinkedList testSingle = new SinglyLinkedList();

		final int realsize = 8;
		boolean j = true;
		for (int i = 0; i < realsize; i++) {

			testDouble.add(i);
			testSingle.add(i);
		}

		boolean doublesize = testDouble.contains(0);
		boolean singlesize = testSingle.contains(0);
		assertEquals(doublesize, j);
		assertEquals(singlesize, j);

	}
}
