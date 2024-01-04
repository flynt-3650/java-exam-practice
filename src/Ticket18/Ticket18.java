package Ticket18;

public class Ticket18 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 9, 7, -3, 0, 42, 308, 17};
        ArrayIntList ail = new ArrayIntList();
        ail.setElementData(arr);
        System.out.println(ail.longestSortedSequence());
    }

}

