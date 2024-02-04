/*
 * Copyright (c) fl_3650.
 */

package ticket18;

class ArrayIntList {
    private int[] elementData;

    public void setElementData(int[] elementData) {
        this.elementData = elementData;
    }

    public int longestSortedSequence() {
        int arraySize = this.elementData.length;
        if (arraySize == 0)
            return 0;

        int result = 1;
        int currNonDecreasingSeqLength = 1; // current accumulated length of the non-decreasing sequence
        int currNonIncreasingSeqLength = 1; // current cumulative length of the non-increasing sequence
        int previous = this.elementData[0];

        for (int i = 1; i < arraySize; ++i) {
            int current = this.elementData[i];
            if (current > previous) {
                currNonDecreasingSeqLength++;

                // check if the length of the current sequence does not exceed the length of the
                // previous sequence
                result = Integer.max(currNonIncreasingSeqLength, result);
                currNonIncreasingSeqLength = 1;
            } else if (current < previous) {
                currNonIncreasingSeqLength++;

                // check if the length of the current sequence does not exceed the length of the
                // previous sequence
                result = Integer.max(currNonDecreasingSeqLength, result);
                currNonDecreasingSeqLength = 1;
            } else {
                currNonDecreasingSeqLength++;
                currNonIncreasingSeqLength++;
            }

            previous = current;
        }

        // check if the sequence ends on the last element of the array
        result = Integer.max(currNonDecreasingSeqLength, result);
        result = Integer.max(currNonIncreasingSeqLength, result);
        return result;
    }
}
