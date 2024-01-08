package ticket11;

public class LinkedIntList {
    private ListNode front;

    public void firstLast() {
        // Если список пуст или содержит только один элемент, ничего не делаем
        if (front == null || front.next == null) {
            return;
        }

        // Находим последний узел в списке
        ListNode last = front;
        while (last.next != null) {
            last = last.next;
        }

        // Перемещаем первый элемент в конец списка
        last.next = front;
        front = front.next;
        last.next.next = null;
    }

    public void display() {
        ListNode current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();

        list.front = new ListNode(18);
        list.front.next = new ListNode(4);
        list.front.next.next = new ListNode(27);
        list.front.next.next.next = new ListNode(9);
        list.front.next.next.next.next = new ListNode(54);
        list.front.next.next.next.next.next = new ListNode(5);
        list.front.next.next.next.next.next.next = new ListNode(63);

        System.out.println("Исходный список:");
        list.display();

        list.firstLast();

        System.out.println("Список после вызова firstLast:");
        list.display();
    }
}
