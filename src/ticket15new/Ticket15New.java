/*
 * Copyright (c) Rarmash. https://rarmash.ru
 */

package ticket15new;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Ticket15New {
    public static void reverseHalf(Queue<Integer> queue) {
        Queue<Integer> oddQueue = new LinkedList<>();
        Queue<Integer> evenQueue = new LinkedList<>();

        for (int i = 0; !queue.isEmpty(); i++) {
            if (i % 2 == 0) {
                evenQueue.offer(queue.poll());
            } else {
                oddQueue.offer(queue.poll());
            }
        }

        // Here we reverse the queue
        Stack<Integer> stack = new Stack<>();
        while (!oddQueue.isEmpty()) {
            stack.push(oddQueue.poll());
        }

        // Filling final queue
        while (!evenQueue.isEmpty() || !stack.isEmpty()) {
            if (!evenQueue.isEmpty()) {
                queue.offer(evenQueue.poll());
            }
            if (!stack.isEmpty()) {
                queue.offer(stack.pop());
            }
        }
    }

    public static void main(String[] args) {
        // Пример использования
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(8);
        queue.offer(7);
        queue.offer(2);
        queue.offer(9);
        queue.offer(18);
        queue.offer(12);
        queue.offer(0);

        System.out.println("Исходная очередь: " + queue);

        reverseHalf(queue);

        System.out.println("Измененная очередь: " + queue);
    }
}
