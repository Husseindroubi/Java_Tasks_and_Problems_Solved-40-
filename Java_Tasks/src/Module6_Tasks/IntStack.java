package Module6_Tasks;

import Doubly.Package.DoublyLinkedList;

public class IntStack {
    // Implementing an INT Stack with encapsulation:
    private DoublyLinkedList<Integer> myStack;

    public IntStack() {
        myStack = new DoublyLinkedList<>();
    }

    // Adding void push(int newElement) Method
    void push(int element) {
        myStack.add(element);
    }

    // Adding int size() Method
    int size() {
        return myStack.size();
    }

    // ADDING int pop() Method
    int pop() {
        if (myStack.size() < 1) {
            throw new IllegalArgumentException("No elements to be removed!!");
        }
        else {
            return myStack.remove(size()-1);
        }
    }

    // Adding int peek() Method
    int peek() {
        if (myStack.size() < 1) {
            throw new IllegalArgumentException("No element found!!");
        }
        else {
            return myStack.get(size() - 1);
        }
    }

    // Adding int[] delete(int n) Method
    public int[] delete(int n) {
        if (size() == 0) {
            System.out.println("Stack is empty");
            return new int[0]; // Return an empty array or throw an exception
        }
        if (n > size()) {
            n = size(); // remove all elements in this case
        }

        int[] elements = new int[n];
        for (int i = 0; i < n; i++) {
            elements[i] = myStack.remove(size() - 1);
        }
        return elements;
    }

    public static void main(String[] args) {
        // try out your stack methods after creating it :

        IntStack testStack = new IntStack();
        System.out.println("Stack size before push : " + testStack.size());;

        // testing push Method by adding 7 elements :
        testStack.push(1);
        testStack.push(2);
        testStack.push(5);
        testStack.push(8);
        testStack.push(-6);
        testStack.push(-99);
        testStack.push(100);

        // Testing size Mehtod (7 elements should be added) :
        System.out.println("Stack size after pushing 7 elements 0 + 7 = " + testStack.size());
        System.out.println("------------------------------------------------------------");

        // Testing pop Method :
        testStack.pop();
        testStack.pop();
        System.out.println("Stack size after popping 2 elements 7 - 2 = " + testStack.size()); // should be 5 elements after popping 2 elements
        System.out.println("------------------------------------------------------------");

        // Testing peek Method (looking at the last element):
        System.out.println("Last element of this Stack is : " + "[" + testStack.peek() + "]");
        System.out.println("Stack size still the same : " + testStack.size()); // number of elements stay the same after peeking (5)
        System.out.println("------------------------------------------------------------");

        // Testing delete Method (removing an amount of elements)
        System.out.println("Current Stack size : " + testStack.size());
        testStack.delete(4);
        System.out.println("New amount of elements after deleting is 5 - 4 = " + testStack.size());// final stack size should be 1
        System.out.println("------------------------------------------------------------");


    }
}



