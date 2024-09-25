package structures.generic;

/**
 * Doubly linked list implementation of myList interface
 * 
 * @author William Goble
 * @author Dickinson Colelge
 * @version Feb 12 2024
 */
public class MyDoublyLinkedList<E> implements MyList<E> {
    private DLLNode head;
    private DLLNode tail;
    private int size;    

    /**
	 * Construct a new empty MyDoublyLinkedList.
	 */
    public MyDoublyLinkedList() {
        /*
		 * This implementation uses dummy head and tail nodes to simplify the
		 * implementation of insert/remove/add operations at the start or end of
		 * the list.
		 */
        head = new DLLNode(null, null, null);
        tail = new DLLNode(null, head, null);
        head.next = tail;
        size = 0;
    }

    /**
	 * {@inheritDoc}
	 */
    public int size() {
        return size;
    }

    /**
	 * {@inheritDoc}
	 */
    public void add(E element) {
        DLLNode pred = tail.prev;
        DLLNode node = new DLLNode(element, pred, tail);
        pred.next = node;
        tail.prev = node;

        size++;
    }

    /*
	 * Helper method to get the DLLNode at the specified index.
	 * 
	 * Throws exception if the index is not valid.
	 */
    private DLLNode getNode(int index) {
        checkBounds(index);
        DLLNode curr = head.next;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        return curr;
    }

    /*
	 * Helper method that throws an exception if the index is not valid.
	 */
    private void checkBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index 
                            + " on List of size " + size + ".");
        }
    }

    /**
	 * {@inheritDoc}
	 */
    public E get(int index) throws IndexOutOfBoundsException {
        DLLNode node = getNode(index);
        return node.element;
    }

    /**
	 * {@inheritDoc}
	 */
    public void set(int index, E element) throws IndexOutOfBoundsException {
        DLLNode node = getNode(index);
        node.element = element;
    }

    /**
	 * {@inheritDoc}
	 */
    public void insert(int index, E element) throws IndexOutOfBoundsException {
        /*
		 * If the index is passed the end of the list, then tail will succeed
		 * (appear immediately after) the new node. Otherwise, the node at index
		 * succeeds the new node.  Need this because, getNode throws an exception
		 * when index is out of range.
		 */
        DLLNode succ = tail;
        if (index != size) {
            succ = getNode(index);
        }

        // Whatever succ points to now comes after new node.
        DLLNode node = new DLLNode(element, succ.prev, succ);
        succ.prev.next = node;
        succ.prev = node;

        size++;
    }

    /**
     * {@inheritDoc}
     */
    public E remove(int index) throws IndexOutOfBoundsException {
        // Intentionally not implemented, to be done as a homework assignment
        return null;
    }

    public boolean findString(String target) {
        DLLNode node = head;
        while (node.next != tail) {
            node = node.next;
            if (node.element.equals(target)) {
                return true;
            }
        }
        return false;
    }
    
    public void reverse() {
        DLLNode node = tail;
        while (node.prev != head) {
            node = node.prev;
            System.out.println(node.element);
        }
    }

    public static void main(String[] args) {
        MyDoublyLinkedList<String> myList = new MyDoublyLinkedList<String>();
        for(int i = 1; i <= 10; i++) {
            if(i == 5) {
                myList.add("Go Birds");
            }
            myList.add("Test" + i);
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("*********************");
        System.out.println("*********************");
        myList.reverse();

        if(myList.findString("Go Birds")) {
            System.out.println("List contains 'Go Birds'");
        } else {
            System.out.println("List doesn't contains 'Go Birds'");
        }
    }

    /*
	 * Defines the node object for the doubly linked list. Note: Fields are
	 * public so that they can be accessed directly rather than via accessors
	 * and mutators. This make the implementations of the doubly linked list
	 * methods above easier to implement and read. And because the DLLNode class
	 * is private to this class it is not an egregious violation of
	 * encapsulation.
	 */
    private class DLLNode {
        public E element;
        public DLLNode prev;
        public DLLNode next;

        public DLLNode(E element, DLLNode prev, DLLNode next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
}
