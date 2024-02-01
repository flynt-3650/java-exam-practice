/*
 * Copyright (c) fl_3650.
 */

package newticket14;

class Main {
    public static void main(String[] args) {
        int[] arr1 = {3, 8, 2, 5, 19, 24, -3, 0, 4, 4, 8, 205, 42};
        ArrayIntList ail1 = new ArrayIntList(arr1, arr1.length);
        System.out.println(ail1.isPairwiseSorted());

        int[] arr2 = {1, 9, 3, 17, 4, 28, -5, -3, 0, 42, 308, 409, 19, 17, 2, 4};
        ArrayIntList ail2 = new ArrayIntList(arr2, arr2.length);
        System.out.println(ail2.isPairwiseSorted());
    }
}
