/*
 * Copyright (c) fl_3650.
 */

package ticket14;

import java.util.*;

class Ticket14 {
    static boolean equals(Stack<Integer> stack1, Stack<Integer> stack2) {
        if (stack1.size() != stack2.size())
            return false;

        Stack<Integer> helper = new Stack<>();

        while (!stack1.isEmpty()) {
            Integer el1 = stack1.pop();
            Integer el2 = stack2.pop();

            if (el1.equals(el2)) {
                helper.push(el1);
                helper.push(el2);
            } else {
                return false;
            }
        }

        while (!helper.isEmpty()) {
            stack1.push(helper.pop());
            stack2.push(helper.pop());
        }

        return true;
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        stack2.push(1);
        stack2.push(2);
        stack2.push(4);

        System.out.println("Equality: " + equals(stack1, stack2));
    }
}
