/*
 * Copyright (c) Eliza
 */

package ticket16;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

class Ticket16 {
    public static Stack<Integer> copyStack(Stack<Integer> stack) {
        Stack<Integer> result = new Stack<Integer>();
        int entrySize = stack.size();

        // if we take into account the stack implementation, it will be useful to report the required size
        result.ensureCapacity(entrySize); // vector method
        Queue<Integer> queue = new ArrayDeque<Integer>(entrySize);

        while (!stack.isEmpty()) {
            queue.add(stack.pop()); // loading in reverse order
        }
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop()); // loading in direct order
        }
        while (!queue.isEmpty()) {
            // distribution
            int tmp = queue.poll();
            stack.push(tmp);
            result.push(tmp);
        }
        return result;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        Stack<Integer> copiedStack = copyStack(stack);
        System.out.println("Original stack");
        System.out.println(stack);
        System.out.println("Stack after using copyStack");
        System.out.println(copiedStack);
    }

}
