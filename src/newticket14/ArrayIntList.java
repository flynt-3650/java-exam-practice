/*
 * Copyright (c) fl_3650.
 */

package newticket14;

class ArrayIntList {
    private final int[] elementData;
    private final int size;

    public ArrayIntList(int[] elementData, int size) {
        this.elementData = elementData;
        this.size = size;
    }

    public boolean isPairwiseSorted() {
        for (int i = 0; i < size - 1; i += 2) {
            if (!(elementData[i] <= elementData[i + 1])) {
                return false;
            }
        }
        return true;
    }
}
