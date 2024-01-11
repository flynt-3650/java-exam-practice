package ticket25;

import java.util.LinkedList;

public class StackOnList<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void push(T item) {
        list.addFirst(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Empty");
        }
        return list.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        StackOnList<Integer> stack = new StackOnList<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Size: " + stack.size());
        System.out.println("Top: " + stack.peek());

        System.out.println("Popping:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
