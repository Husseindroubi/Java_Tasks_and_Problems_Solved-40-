class Node<E> {
    E value;
    Node<E> next;

    public Node(E value) {
        this.value = value;
        this.next = null;
    }
}


public class LinkedList<E> {
    private Node<E> head;
    private int size;
    private Node<E> FindElementAtIndex(int index)
    {

        Node<E> current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        return current;
    }

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public boolean add(E e) {

        // Define locals
        // -------------
        Node<E> newNode = new Node<>(e);

        // First Element
        // -------------
        if (head == null) {
            head = newNode;

        // Other Elements
        // --------------
        } else {

            // Define locals
            // -------------
            Node<E> current = head;

            // Search Add Point
            // ----------------
            while (current.next != null) {
                current = current.next;
            }

            // Add new Node
            // ------------
            current.next = newNode;
        }
        size++;
        return true;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            Node<E> newNode = new Node<>(element);
            newNode.next = head;
            head = newNode;
        } else {
            Node<E> newNode = new Node<>(element);

            // Get Element At index
            // --------------------
            Node<E> current = FindElementAtIndex(index);

            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }


        // Get Element At index
        // --------------------
        Node<E> current = FindElementAtIndex(index);

        return current.value;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node<E> removedNode;
        if (index == 0) {
            removedNode = head;
            head = head.next;
        } else {

            // Get Element At index
            // --------------------
            Node<E> current = FindElementAtIndex(index);

            removedNode = current.next;
            current.next = current.next.next;
        }
        size--;
        return removedNode.value;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head;
        while (current != null) {
            result.append(current.value);
            if (current.next != null) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(1, 8);

        System.out.println("List: " + list.toString());
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Removed element at index 1: " + list.remove(1));
        System.out.println("List size: " + list.size());
        System.out.println("Updated List: " + list.toString());
    }


}
