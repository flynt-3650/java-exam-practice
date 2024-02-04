/*
 * Copyright (c) fl_3650.
 */

package ticket22;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Sorter<Integer> integerSorter = new Sorter<>();
        List<Integer> list = new LinkedList<>(Arrays.asList(5, 4, 3, 2, 1));
        integerSorter.bubbleSort(list);

        for (var item: list) System.out.print(item + " ");

        System.out.println();

        Sorter<Double> doubleSorter = new Sorter<> ();
        List<Double> list1 = new ArrayList<>(Arrays.asList(5.6, 4.5, 3.6, 2.2, 1.1));
        doubleSorter.quickSort(list1, 0, list1.size() - 1);

        for (var item: list1) System.out.print(item + " ");

        System.out.println();

        Sorter<Long> longSorter = new Sorter<>();
        List<Long> list2 = new Vector<>(Arrays.asList(5L, 4L, 3L, 2L, 1L));
        longSorter.quickSort(list2, 0, list1.size() - 1);

        for (var item: list2) System.out.print(item + " ");
    }
}