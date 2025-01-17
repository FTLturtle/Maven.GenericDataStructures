package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList<E> elements;


    public Stack(){
        this.elements = new ArrayList<>();
    }

    public void push(E item) {
        elements.add(item);
    }

    public E pop() {
        E item = elements.get(elements.size() - 1);
        elements.remove(elements.size() - 1);
        return item;
    }

    public boolean isEmpty() {
        boolean result = false;
        if (elements.size() == 0) {
            result = true;
        }
        return result;
    }

}
