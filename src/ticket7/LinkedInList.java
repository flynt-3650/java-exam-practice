/*
 * Copyright (c) Eliza
 */

package ticket7;
class LinkedInList {
    private ListNode first;

    public void removeAll(LinkedInList list2) {
        ListNode curList1 = first;
        ListNode curList2 = list2.first;
        ListNode previous = null;

        while (curList1 != null && curList2 != null) {
            if (curList1.val == curList2.val) {
                if (previous == null) {
                    first = curList1.next;
                    curList1 = first;
                } else {
                    previous.next = curList1.next;
                    curList1 = curList1.next;
                }
            } else if (curList1.val < curList2.val) {
                previous = curList1;
                curList1 = curList1.next;
            } else {
                curList2 = curList2.next;
            }
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
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println("the end of LinkedList");
    }
    public static void main(String[] args) {
        LinkedInList linkedIntList1 = new LinkedInList();
        LinkedInList linkedIntList2 = new LinkedInList();
        linkedIntList1.addToList(1);
        linkedIntList1.addToList(2);
        linkedIntList1.addToList(3);
        linkedIntList1.addToList(4);
        linkedIntList2.addToList(1);
        linkedIntList2.addToList(2);
        linkedIntList2.addToList(5);
        linkedIntList2.addToList(6);
        linkedIntList1.printList();
        linkedIntList2.printList();
        linkedIntList1.removeAll(linkedIntList2);
        linkedIntList1.printList();


    }
}
