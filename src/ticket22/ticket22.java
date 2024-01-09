/*
 * Copyright (c) Eliza
 */

package ticket22;
//interface Sortable<T> {
//     int comparable(T a, T b);
//}
class ticket22  {
    public static <T> void sort(T arr[]) {
        for (int i = 0; i < arr.length; i++ ) {
            for (int j = i+1; j < arr.length-1; j++ ) {
                if(comparable(arr[i],arr[j]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }


    public static int comparable(Object a, Object b) {
        if (a.equals(b)) {
            return 0;
        } else if ((int) a < (int) b) {
            return -1;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 9, 1, 5, 6};
        System.out.println("Before sorting: " );
        for(int i = 0; i < intArray.length;i++) {
            System.out.println(intArray[i]);
        }
        sort(intArray);
        for(int i = 0; i < intArray.length;i++) {
            System.out.println(intArray[i]);
        }
    }

}
