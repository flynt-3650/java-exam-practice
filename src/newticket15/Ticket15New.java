/*
 * Copyright (c) Rarmash. https://rarmash.ru
 */

package newticket15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Ticket15New {
    public static void reverseHalf(Queue<Integer> queue)
    {
        Stack<Integer> stack = new Stack<Integer>();
        int queueSize = queue.size();
        int middle = queue.size() >>> 1; // divide by 2

        // first pass, distribution
        for (int i = 0; i < middle; i++)
        {
            queue.add(queue.poll());
            stack.push(queue.poll());
        }

        boolean flag = (queueSize & 1) == 1; // true if the queue length is odd

        if (flag)
        {
            queue.add(queue.poll());
        }

        // here the queue size is equal to middle (+1 if flag)

        // second pass, merge
        for (int i = 0; i < middle; i++)
        {
            queue.add(queue.poll());
            queue.add(stack.pop());
        }

        if (flag)
        {
            queue.add(queue.poll());
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

        System.out.println("Initial Queue: " + queue);

        reverseHalf(queue);

        System.out.println("Altered Queue: " + queue);
    }
}
