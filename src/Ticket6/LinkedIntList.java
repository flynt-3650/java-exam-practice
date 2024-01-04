/*
 * Copyright (c) fl_3650.
 */

package Ticket6;

class LinkedIntList {
    private ListNode front;

    public void removeAll(LinkedIntList other) {
        ListNode current1 = this.front;
        ListNode current2 = other.front;
        ListNode prev = null;

        while (current1 != null && current2 != null) {
            if (current1.data == current2.data) {
                if (prev == null) {
                    this.front = current1.next;
                } else {
                    prev.next = current1.next;
                }
                current1 = current1.next;
            } else if (current1.data < current2.data) {
                prev = current1;
                current1 = current1.next;
            } else {
                current2 = current2.next;
            }
        }
    }
}
