package ticket16;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Stack;

class Ticket16 {
    public static void reverseHalf(Deque<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < queue.size(); i++) {
            if (i % 2 != 0) stack.push(queue.peek());
            queue.offer(queue.poll());
        }

        for (int i = 0; i < queue.size(); i++) {
            if (i % 2 != 0) {
                queue.poll();
                queue.offer(stack.pop());
            } else {
                queue.offer(queue.poll());
            }
        }
    }

    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(8);
        queue.offer(7);
        queue.offer(2);
        queue.offer(9);
        queue.offer(18);
        queue.offer(12);
        queue.offer(0);
        queue.offer(5);

        System.out.println("Initial Queue: " + queue);

        reverseHalf(queue);

        System.out.println("Altered Queue: " + queue);
    }
}
