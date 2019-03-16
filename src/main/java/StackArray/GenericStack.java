package StackArray;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;

    public GenericStack() {
    }

    public void push(E item) {
        E[] newArray;
        if (elements == null) {
            newArray = (E[]) Array.newInstance(item.getClass(), 1);
        } else {
            newArray = Arrays.copyOf(elements, elements.length + 1);
        }

        newArray[newArray.length - 1] = item;
        elements = newArray;
    }

    public E pop() {
        if (elements == null || elements.length == 0)
            throw new IndexOutOfBoundsException();

        E item = elements[elements.length - 1];
        elements = Arrays.copyOf(elements, elements.length - 1);
        return item;
    }

    public boolean isEmpty() {
        boolean result = false;
        if (elements == null || elements.length == 0) {
            result = true;
        }
        return result;
    }
}
