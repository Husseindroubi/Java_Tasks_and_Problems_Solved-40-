package Doubly.Package;

class Node<E> {
    E value;
    Node<E> next;
    Node<E> prev;

    public Node(E value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}


public class DoublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean add(E e) {
        Node<E> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
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
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
        } else if (index == size) {
            add(element);
        } else {
            Node<E> newNode = new Node<>(element);
            Node<E> current = getNode(index - 1);
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
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

        if (index <= size / 2) {
            Node<E> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.value;
        } else {
            Node<E> current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
            return current.value;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node<E> removedNode;
        if (index == 0) {
            removedNode = head;
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else if (index == size - 1) {
            removedNode = tail;
            tail = tail.prev;
            tail.next = null;
        } else {
            Node<E> current = getNode(index);
            removedNode = current;
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
        return removedNode.value;
    }

    private Node<E> getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
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

    public String toStringReverse() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = tail;
        while (current != null) {
            result.append(current.value);
            if (current.prev != null) {
                result.append(", ");
            }
            current = current.prev;
        }
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(1, 8);

        System.out.println("List: " + list.toString());
        System.out.println("Reversed List: " + list.toStringReverse());
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Removed element at index 1: " + list.remove(1));
        System.out.println("List size: " + list.size());
        System.out.println("Updated List: " + list.toString());
    }
}
