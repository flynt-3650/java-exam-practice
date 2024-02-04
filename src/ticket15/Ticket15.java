/*
 * Copyright (c) Rarmash. https://rarmash.ru
 */

package ticket15;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Ticket15 {
    public static void reverseHalf(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        int qSize = q.size();

        for (int i = 0; i < qSize; i++) {
            if (i % 2 != 0) stack.push(q.peek());

            q.offer(q.poll());
        }

        for (int i = 0; i < qSize; i++) {
            if (i % 2 != 0) {
                q.poll();
                q.offer(stack.pop());
            } else {
                q.offer(q.poll());
            }
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 8, 7, 2, 9, 18, 12, 0));

        System.out.println("Initial Queue: " + queue);

        reverseHalf(queue);

        System.out.println("Altered Queue: " + queue);
    }
}
