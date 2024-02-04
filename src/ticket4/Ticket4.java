/*
 * Copyright (c) fl_3650.
 */

package ticket4;

import java.util.*;

class Ticket4 {
    public static boolean hasOdd(Set<Integer> set) {
        if (set.isEmpty()) return false;

        for (var item : set)
            if (item % 2 != 0) return true;

        return false;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 4, 5));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(2, 4, 6));
        Set<Integer> set3 = new TreeSet<>();

        System.out.println(hasOdd(set1));
        System.out.println(hasOdd(set2));
        System.out.println(hasOdd(set3));
    }
}
