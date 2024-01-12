/*
 * Copyright (c) Eliza
 */
// Напишите реализацию структуры ArrayList на списке
package ticket26;

import java.util.ArrayList;


class myArrayList<T> {
    private static final int DEFAULT_SIZE = 10;
    private int size;
    private  Object[] list;

    public myArrayList(int size) {
        if(size <= 0) {

            throw new  IllegalArgumentException("size <= 0");
        } else {
            list = (T[]) new Object[size];

        }
    }
    public myArrayList() {
        list = (T[]) new Object[DEFAULT_SIZE];
    }
    private void ensureSize() {
        if (size >= list.length) {
            int newSize = size * 2;
            Object[] newList = new Object[newSize];
            cloneList(newList, list);
            list = newList;
        }
    }
    private void cloneList(Object[] newList, Object[] oldList) {
        if (size >= 0) System.arraycopy(oldList, 0, newList, 0, size);
    }

    public int index(T element) {
        if (element == null) {
            return -1;
        } else {
            for (int i = 0; i < size; i++) { // fix the loop condition here
                if (list[i].equals(element))
                    return i;
            }
        }
        return -1;
    }

    public void add(T element) {
        ensureSize();
        list[size++] = element;
    }
    public void add(int index, T element) {
        //here must be check for overflowing
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }else {
            ensureSize();
            for (int i = size; size > 0; size--) {
                list[index] = list[i-1];
            }

            list[index] = element;
            size++;
        }

    }
    public void delеte(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }else {
            for (int i = index; i < size; i++) {
                list[i] = list[i + 1];
            }
            size--;
        }
    }
    public void delеte(T element) {
        int index = index(element);
        delеte(index);
    }
    public void print(){
        for(T element : (T[]) list) {
            System.out.print(element + " ");

        }
    }


}