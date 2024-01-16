/*
 * Copyright (c) fl_3650.
 */

package ticket27;

import java.util.Arrays;

class MyArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;

    private T[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        this.data = (T[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public MyArrayList(T[] data) {
        this.data = Arrays.copyOf(data, data.length);
        this.size = data.length;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return data[index];
    }

    public void add(T newItem) {
        ensureCapacity();
        data[size++] = newItem;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        // Shift elements to the left to fill the gap
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        // Set the last element to null and decrease the size
        data[--size] = null;
    }

    public int search(T item) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    private void ensureCapacity() {
        if (size == data.length) {
            int newCapacity = data.length * 2;
            data = Arrays.copyOf(data, newCapacity);
        }
    }
}
