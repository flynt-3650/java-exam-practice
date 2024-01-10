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
        if (a instanceof Integer && b instanceof Integer) {
            if ((Integer) a > (Integer) b) {
                return 1;
            } else if (a.equals(b)) {
                return 0;
            } else {
                return -1;
            }
        }
        if (a instanceof Double && b instanceof Double) {
            if ((Double) a > (Double) b) {
                return 1;
            } else if (a.equals(b)) {
                return 0;
            } else {
                return -1;
            }
        }
        return 2;
    }

    // ToDo: add quickSort
}
