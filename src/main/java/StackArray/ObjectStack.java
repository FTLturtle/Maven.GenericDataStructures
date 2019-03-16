package StackArray;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;

    public ObjectStack() {
        elements = new Object[0];
    }

    public void push(E item) {
        Object[] newArray = Arrays.copyOf(elements, elements.length + 1);
        newArray[newArray.length - 1] = item;
        elements = newArray;
    }

    public E pop() {
        E item = (E) elements[elements.length - 1];
        elements = Arrays.copyOf(elements, elements.length - 1);
        return item;
    }

    public boolean isEmpty() {
        boolean result = false;
        if (elements.length == 0) {
            result = true;
        }
        return result;
    }
}
