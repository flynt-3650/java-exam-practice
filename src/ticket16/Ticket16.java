package ticket16;

import java.util.*;

class Ticket16 {
    public static void reverseHalf(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < queue.size(); i++) {
            if (i % 2 != 0)
                stack.push(queue.peek());
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
        Queue<Integer> queue = new LinkedList<>();

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
