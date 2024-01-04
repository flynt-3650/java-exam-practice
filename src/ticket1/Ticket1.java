/*
 * Copyright (c) fl_3650.
 */

package ticket1;

import java.util.*;

class Ticket1 {
    public static ArrayList<Integer> alternate(int[] l1, int[] l2) {
        ArrayList<Integer> result = new ArrayList<>();
        if (l1.length == 0 && l2.length == 0) {
            return result;
        }

        if (l1.length == l2.length) {
            for (int i = 0; i < l1.length; ++i) {
                result.add(l1[i]);
                result.add(l2[i]);
            }
        } else if (l1.length > l2.length) {
            int i = 0;
            for (;i < l2.length; ++i) {
                result.add(l1[i]);
                result.add(l2[i]);
            }
            for (; i < l1.length; ++i) {
                result.add(l1[i]);
            }
        } else {
            int i = 0;
            for (;i < l1.length; ++i) {
                result.add(l1[i]);
                result.add(l2[i]);
            }
            for (; i < l2.length; ++i) {
                result.add(l2[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] l1 = {1, 2, 3, 4, 5};
        int[] l2 = {6, 7, 8, 9, 10};

        for (var item : alternate(l1, l2))
            System.out.print(item + " ");
    }
}
