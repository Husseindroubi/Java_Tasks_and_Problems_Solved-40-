package Module6_Tasks;

import Doubly.Package.DoublyLinkedList;

public class IntQueue {

    //    Implementing an IntQueue!
    private DoublyLinkedList<Integer> myQueue;

    public IntQueue() {
        myQueue = new DoublyLinkedList<>();
    }

    //    void enqueue(int newElement) : adds a new element to the back of the queue
    void enqueue(int element) {
        myQueue.add(element);
    }

    //    int size() : returns the number of elements in the queue
    int size() {
        return myQueue.size();
    }

    //    int dequeue() : returns the first element of the queue and removes it from the queue
    int dequeue() {
        if (myQueue.size() < 1) {
            throw  new IllegalArgumentException("There are no elements to be removed!!!");
        }
        else {
            System.out.println("1st element of this Queue is : " + myQueue.get(0));
            return myQueue.remove(0);
        }
    }

    //    int[] dequeue(int n) : returns the first n elements of the queue and removes them from the queue
    int[] delete(int n) {
        if (size() < 1) {
            System.out.println("Queue is empty");
            return new int[0]; // Return an empty array or throw an exception
        }
        if (n > size()) {
            n = size(); // remove all elements in this case
        }

        int[] elements = new int[n];
        for (int i = 0; i < n; i++) {
            elements[i] = myQueue.remove(0);
        }
        return elements;
    }

    //    Create a queue in the main method and write a few example uses.
    public static void main(String[] args) {

        // create a new Queue :
        IntQueue testQueue = new IntQueue();

        // add some elements to this queue :
        testQueue.enqueue(5);
        testQueue.enqueue(11);
        testQueue.enqueue(-7);
        testQueue.enqueue(0);
        testQueue.enqueue(10);
        testQueue.enqueue(3);
        System.out.println("Queue size after addding 6 elements is : " + testQueue.size());
        System.out.println("-----------------------------------------------------------------------");

        // remove some elements from this queue:
        testQueue.dequeue();
        testQueue.dequeue();
        System.out.println("Queue size now is : " + testQueue.size());
        System.out.println("-----------------------------------------------------------------------");

        // delete one or more element(s) :
        testQueue.delete(2);
        System.out.println("Queue size now is : " + testQueue.size());
        System.out.println("-----------------------------------------------------------------------");



    }

}
