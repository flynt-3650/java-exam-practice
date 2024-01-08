/*
 * Copyright (c) fl_3650.
 */

package ticket1;

import java.util.*;

class Ticket1 {
    public static List<Integer> alternate(List<Integer> l1, List<Integer> l2) {
        List<Integer> result = new ArrayList<>();

        if (l1.isEmpty() && l2.isEmpty()) {
            return result;
        }

        if (l1.size() == l2.size()) {
            for (int i = 0; i < l1.size(); ++i) {
                result.add(l1.get(i));
                result.add(l2.get(i));
            }
        } else if (l1.size() > l2.size()) {
            int i = 0;
            for (; i < l2.size(); ++i) {
                result.add(l1.get(i));
                result.add(l2.get(i));
            }
            for (; i < l1.size(); ++i) {
                result.add(l1.get(i));
            }
        } else {
            int i = 0;
            for (; i < l1.size(); ++i) {
                result.add(l1.get(i));
                result.add(l2.get(i));
            }
            for (; i < l2.size(); ++i) {
                result.add(l2.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));

        for (var item : alternate(l1, l2))
            System.out.print(item + " ");
    }
}
