/*
 * Copyright (c) Eliza
 */

package ticket22;

import java.util.Comparator;
import java.util.List;

class Sorter<T extends Number> implements Comparator<T> {
    public void bubbleSort(List<T> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compare(list.get(j), list.get(j + 1)) > 0) {
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    @Override
    public int compare(T a, T b) {
        return Double.compare(a.doubleValue(), b.doubleValue());
    }

    public void quickSort(List<T> list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);
            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    private int partition(List<T> list , int low, int high) {
        T pivot = list.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (compare(list.get(j),pivot) <= 0) {
                i++;
                swap(list, i, j);
            }
        }

        swap(list, i + 1, high);
        return i + 1;
    }

    private void swap(List<T> list, int i, int j) {
        var temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
