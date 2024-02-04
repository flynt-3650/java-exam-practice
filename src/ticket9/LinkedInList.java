/*
 * Copyright (c) Eliza
 */

package ticket9;

class LinkedInList {
    private ListNode first;

    public void removeDuplicates() {
        ListNode current = first;
        while (current != null) {
            ListNode prev = current;
            ListNode helper = current.getNext();

            while (helper != null) {
                if (helper.getVal() == current.getVal()) {
                    prev.next = helper.next;
                } else {
                    prev = helper;
                }
                helper = helper.next;
            }
            current = current.next;
        }
    }

    public void addToList(int val) {
        ListNode listNode = new ListNode(val);
        ListNode last = first;
        if (first == null) {
            first = listNode;
        } else {
            while (last.next != null) {
                last = last.next;
            }
            last.next = listNode;
        }

    }

    public void printList() {
        ListNode current = first;
        while (current != null) {
            System.out.print(current.getVal() + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedInList linkedIntList1 = new LinkedInList();
        linkedIntList1.addToList(14);
        linkedIntList1.addToList(8);
        linkedIntList1.addToList(14);
        linkedIntList1.addToList(12);
        linkedIntList1.addToList(1);
        linkedIntList1.addToList(14);
        linkedIntList1.addToList(11);
        linkedIntList1.addToList(8);
        linkedIntList1.addToList(8);
        linkedIntList1.addToList(10);
        linkedIntList1.addToList(4);
        linkedIntList1.addToList(9);
        linkedIntList1.addToList(1);
        linkedIntList1.addToList(2);
        linkedIntList1.addToList(5);
        linkedIntList1.addToList(2);
        linkedIntList1.addToList(4);
        linkedIntList1.addToList(12);
        linkedIntList1.addToList(12);
        linkedIntList1.printList();
        linkedIntList1.removeDuplicates();
        linkedIntList1.printList();
    }
}
