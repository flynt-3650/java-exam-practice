/*
 * Copyright (c) Eliza
 */
package ticket26;

import java.util.AbstractList;
import java.util.LinkedList;

class MyArrayList<T> extends AbstractList<T> {
    LinkedList<T> list = new LinkedList<>();

    @Override
    public T get(int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException();
        }
        return list.get(index);
    }
    @Override
    public int size() {
        return list.size();
    }

    public T set(int index, T element) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        return list.set(index, element);
    }
    
    @Override
    public boolean add(T t) {
        return list.add(t);
    }


    public void delete(int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException();
        }
         list.remove(index);
    }

    public void print() {
        for (var item : list) {
            System.out.print(item + " ");
        }
    }
}
