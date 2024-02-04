/*
 * Copyright (c) Rarmash. https://rarmash.ru
 */

package ticket21;

class SearchAlgorithm<T extends Comparable<T>> {
    private final T[] array;

    public SearchAlgorithm(T[] array) {
        this.array = array;
    }

    public int linearSearch(T key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(T key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = array[mid].compareTo(key);

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        SearchAlgorithm<Integer> intSearch = new SearchAlgorithm<>(intArray);

        int key = 6; // index

        int linearResult = intSearch.linearSearch(key);
        System.out.println("Linear search result: " + linearResult);

        int binaryResult = intSearch.binarySearch(key);
        System.out.println("Binary search result: " + binaryResult);
    }
}
