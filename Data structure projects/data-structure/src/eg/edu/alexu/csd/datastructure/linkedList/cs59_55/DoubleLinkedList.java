package eg.edu.alexu.csd.datastructure.linkedList.cs59_55;

import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;

/**
 * @author Shiko.
 *
 */
public class DoubleLinkedList implements ILinkedList {
	/**
	 */
	final int k = 0;
	/**
	 * .
	 */
	private DNode head;
	/**
	 * .
	 */
	private DNode tail;
	/**
	 * .
	 */
	private int size;

	/**
	 *  the.
	 */
	public DoubleLinkedList() {
		size = k;
		head = null;
		tail = null;
	}

	/**
	 * Inserts a specified element at.
	 *  the specified sposition in the list.
	 */
	@Override

	public void add(final int index, final Object element) {
		if (head == null && index == k) {
			DNode h = new DNode(element);
			head = h;
			tail = head;
			size++;
			return;
		} else if (head == null && index != k) {
			throw null;
		}
		if (index == k) {
			DNode x = new DNode(element);
			x.setNext(head);
			head = x;
			size++;
			return;
		}
		if (index == size - 1) {
			DNode x = new DNode(element);
			tail.setNext(x);
			tail = x;
			x.setNext(null);
		}

		if (index > size || index < k) {
			throw null;
		}

		int i = k;
		DNode p = head;
		DNode q = new DNode(element);
		DNode prev = head;
		while (i < index) {
			prev = p;
			p = p.getNext();
			i++;
		}
		prev.setNext(q);
		q.setNext(p);
		size++;
	}

	/** Inserts the specified element at.
	 *  the end of the list. */
	@Override

	public void add(final Object element) {
		// TODO Auto-generated method stub
		DNode p = new DNode(element);
		if (head == null) {
			head = p;
			tail = head;
			size++;
		} else {
			DNode x = head;
			while (x.getNext() != null) {
				x = x.getNext();
			}
			x.setNext(p);
			p.setNext(null);
			size++;
		}
	}

	/** Returns the element at the specified.
	 *  position in this list. */

	@Override
	public Object get(final int index) {
		// TODO Auto-generated method stub
		if (head == null) {
			throw null;
		}
		if (index >= size || index < k) {
			throw null;
		}
		try {
			int i = k;
			DNode ans = head;
			while (i < index) {
				i++;
				ans = ans.getNext();
			}
			return ans.getData();
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * Replaces the element at the specified.
	 *  position in this list with the
	 * specified element.
	 */

	@Override
	public void set(
	final int index, final Object element) {
		if (head == null || index >= size) {
			throw null;
		}
		int i = k;
		DNode p = head;
		while (i < size) {
			if (i == index) {
				p.setData(element);
				return;
			}
			i++;
			p = p.getNext();
		}
		throw null;
	}

	/** Removes all of the elements from this list. */

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		head = null;
		tail = null;
		size = k;
	}

	/** Returns true if this list contains no elements. */

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (head == null) {
			return true;
		}
		return false;
	}

	/** Removes the element at the.
	 *  specified position in this list. */

	@Override
	public void remove(final int index) {
		// TODO Auto-generated method stub
		if (head == null || index >= size) {
			throw null;
		}
		DNode p = head;
		if (index == k) {
			head = head.getNext();
			size--;
			return;
		}
		int i = k;
		DNode prev = head;
		while (i < size) {
			if (i == index) {
				prev.setNext(p.getNext());
				p.setNext(null);
				size--;
				return;
			}
			i++;
			prev = p;
			p = p.getNext();
		}
		throw null;
	}

	/** Returns the number of elements in this list. */

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	/**
	 * Returns a view of the portion of this.
	 * list between the specified
	 * fromIndex and toIndex, inclusively.
	 */

	@Override
	public ILinkedList sublist(final int fromIndex, final int toIndex) {
		// TODO Auto-generated method stub
		if (head == null
			|| fromIndex < k
			|| toIndex >= size) {
			throw null;
		}
		DoubleLinkedList f = new DoubleLinkedList();
		int i = k;
		DNode p = this.head;
		while (i < fromIndex && fromIndex >= k) {
			i++;
			p = p.getNext();
		}
		while (i <= toIndex) {
			f.add(p.getData());
			i++;
			p = p.getNext();
		}
		return f;
	}

	/**
	 * Returns true if this list contains an.
	 * element with the same value as the
	 * specified element.
	 */

	@Override
	public boolean contains(final Object o) {
		// TODO Auto-generated method stub
		DNode p = head;
		if (head == null) {
			return false;
		}
		DNode x = new DNode(o);
		while (true) {
			if (p.compareTo(x)) {
				return true;
			}
			if (p.getNext() == null) {
				break;
			}
			p = p.getNext();
		}
		return false;
	}
	/**
	 * @param index1 the.
	 * @param index2 the.
	 */
	void swapInd(final int index1, final int index2) {
		DNode x = head;
		DNode y = head;
		int i = k;
		while (i < index1) {
			x = x.getNext();
			i++;
		}
		i = k;
		while (i < index2) {
			y = y.getNext();
			i++;
		}
		swap(x, y);
	}

	/**
	 * @param x the.
	 * @param y the.
	 */
	void swap(final DNode x, final DNode y) {
		DNode temp = new DNode(x.getData());
		temp.coff = x.coff;
		temp.exp = x.exp;
		x.setData(y.getData());
		x.coff = y.coff;
		x.exp = y.exp;
		y.setData(temp.getData());
		y.coff = temp.coff;
		y.exp = temp.exp;
	}

	/**
	 */
	void sort() {
		DNode x = head;
		DNode y = head;
		while (x != null) {
			y = x.getNext();
			while (y != null) {
				if (y.exp < x.exp) {
					swap(x, y);
				}
				y = y.getNext();
			}
			x = x.getNext();
		}
	}

	/**
	 */
	void display() {
		DNode p = head;
		int i = k;
		if (head == null) {
			return;
		}
		while (i < size) {
			System.out.println(p.getData());
			p = p.getNext();
			i++;
		}
	}
}
