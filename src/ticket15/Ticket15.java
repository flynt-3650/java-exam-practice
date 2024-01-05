/*
 * Copyright (c) fl_3650.
 */

package ticket15;

import java.util.*;

public class Ticket15 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(-5);
        stack.push(2);
        stack.push(-8);
        stack.push(4);
        stack.push(1);

        splitStack(stack);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    static void splitStack(Stack<Integer> stack) {
        Stack<Integer> positiveStack = new Stack<>();
        Stack<Integer> negativeStack = new Stack<>();

        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (current < 0) {
                negativeStack.push(current);
            } else {
                positiveStack.push(current);
            }
        }

        while (!positiveStack.isEmpty()) {
            stack.push(positiveStack.pop());
        }
        while (!negativeStack.isEmpty()) {
            stack.push(negativeStack.pop());
        }
    }
}
