/*
 * Copyright (c) fl_3650.
 */

package ticket29;

import java.util.EmptyStackException;

class Ticket29 {
    public static class GenericArrayStack<E> {
        private static final int DEFAULT_CAPACITY = 10;

        private Object[] array;
        private int size;

        public GenericArrayStack() {
            this.array = new Object[DEFAULT_CAPACITY];
            this.size = 0;
        }

        public void push(E element) {
            ensureCapacity();
            array[size++] = element;
        }

        public E pop() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            E element = peek();
            array[--size] = null;
            return element;
        }

        public E peek() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            return (E) array[size - 1]; // TODO: try to fix unchecked cast
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        private void ensureCapacity() {
            if (size == array.length) {
                int newCapacity = array.length * 2;
                array = java.util.Arrays.copyOf(array, newCapacity);
            }
        }
    }

    public static void main(String[] args) {
        GenericArrayStack<Integer> stack = new GenericArrayStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Size of stack: " + stack.size());

        System.out.println("Top element: " + stack.peek());

        System.out.println("Pop element: " + stack.pop());
        System.out.println("Pop element: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
