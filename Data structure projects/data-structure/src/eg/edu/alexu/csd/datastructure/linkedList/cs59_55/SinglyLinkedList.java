package eg.edu.alexu.csd.datastructure.linkedList.cs59_55;

import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;

/**
 * @author Shiko.
 *
 */
public class SinglyLinkedList implements ILinkedList {
	/**
	 * .
	 */
	private Node head;
	/**
	 * .
	 */
	private Node tail;
	/**
	 * .
	 */
	private int size = 0;

	/**
	 * the.
	 */
	public SinglyLinkedList() {
		size = 0;
		head = null;
		tail = head;
	}

	/**
	 * Inserts a specified element at the.
	 * specified sposition in the list.
	 */
	@Override

	public void add(final int index, final Object element) {
		// TODO Auto-generated method stub
		if (head == null && index == 0) {
			Node h = new Node(element);
			head = h;
			tail = head;
			size++;
			return;
		} else if (head == null && index != 0) {
			throw null;
		}
		if (index == 0) {
			Node x = new Node(element);
			x.setNext(head);
			head = x;
			size++;
			return;
		}
		if (index == size - 1) {
			Node x = new Node(element);
			tail.setNext(x);
			tail = x;
			x.setNext(null);
		}

		if (index > size || index < 0) {
			throw null;
		}

		int i = 0;
		Node p = head;
		Node q = new Node(element);
		Node prev = head;
		while (i < index) {
			prev = p;
			p = p.getNext();
			i++;
		}
		prev.setNext(q);
		q.setNext(p);
		size++;
	}

	/** Inserts the specified element at the end of the list. */
	@Override

	public void add(final Object element) {
		// TODO Auto-generated method stub
		Node p = new Node(element);
		if (head == null) {
			head = p;
			tail = head;
			size++;
		} else {
			Node x = head;
			while (x.getNext() != null) {
				x = x.getNext();
			}
			x.setNext(p);
			p.setNext(null);
			size++;
		}
	}

	/** Returns the element at the.
	 *  specified position in this list. */
	@Override

	public Object get(final int index) {
		// TODO Auto-generated method stub
		if (head == null) {
			return null;
		}
		if (index >= size || index < 0) {
			throw null;
		}
		try {
			int i = 0;
			Node ans = head;
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
	 *  position in this list with the.
	 * specified element.
	 */
	@Override

	public void set(final int index, final Object element) {
		// TODO Auto-generated method stub
		if (head == null || index >= size) {
			throw null;
		}
		int i = 0;
		Node p = head;
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
		tail = head;
		size = 0;
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
	/** Removes the element at the specified.
	 *  position in this list. */
	@Override
	public void remove(final int index) {

		if (head == null || index >= size || index < 0) {
			throw null;
		}
		Node p = head;
		if (index == 0) {
			head = head.getNext();
			p.setNext(null);
			size--;
			return;
		}
		int i = 0;
		Node prev = head;
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
		return size;
	}
	/**
	 * Returns a view of the portion of.
	 *  this list between the specified.
	 * fromIndex and toIndex, inclusively.
	 */
	@Override
	public ILinkedList sublist(
		final int fromIndex, final int toIndex) {
		if (head == null
		|| fromIndex < 0
		|| toIndex >= size) {
			throw null;
		}
		SinglyLinkedList f = new SinglyLinkedList();
		int i = 0;
		Node p = this.head;
		while (i < fromIndex && fromIndex >= 0) {
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
	 * Returns true if this list contains.
	 *  an element with the same value as the
	 * specified element.
	 */
	@Override
	public boolean contains(final Object o) {
		// TODO Auto-generated method stub
		Node p = head;
		if (head == null) {
			return false;
		}
		Node x = new Node(o);
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
}
