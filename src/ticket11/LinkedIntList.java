package ticket11;

class LinkedIntList {
    private ListNode front;

    public void firstLast() {
        if (front == null || front.getNext() == null) {
            return;
        }

        ListNode last = front;
        while (last.getNext() != null) {
            last = last.getNext();
        }

        last.setNext(front);
        front = front.getNext();
        last.getNext().setNext(null);
    }

    public void display() {
        ListNode current = front;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();

        list.front = new ListNode(18);
        list.front.setNext(new ListNode(4));
        list.front.getNext().setNext(new ListNode(27));
        list.front.getNext().getNext().setNext(new ListNode(9));
        list.front.getNext().getNext().getNext().setNext(new ListNode(54));
        list.front.getNext().getNext().getNext().getNext().setNext(new ListNode(5));
        list.front.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(63));

        System.out.println("Initial list: ");
        list.display();

        list.firstLast();

        System.out.println("Result: ");
        list.display();
    }
}
