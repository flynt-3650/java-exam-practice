/*
 * Copyright (c) fl_3650.
 */

package ticket18;

class Ticket18 {
    public static void main(String[] args) {
        ArrayIntList ail = new ArrayIntList();

        ail.setElementData(new int[]{1, 3, 5, 2, 9, 7, -3, 0, 42, 308, 17});
        System.out.println(ail.longestSortedSequence()); // 4 (-3, 0, 42, 308)

        ail.setElementData(new int[]{1, 3, 5, 2, 9, 7, -3, 0, 42, 308, 17, 5, 4, 3});
        System.out.println(ail.longestSortedSequence()); // 5 (308, 17, 5, 4, 3)

        ail.setElementData(new int[]{1});
        System.out.println(ail.longestSortedSequence()); // 1 (1)

        ail.setElementData(new int[]{});
        System.out.println(ail.longestSortedSequence()); // 0 ()
    }
}

