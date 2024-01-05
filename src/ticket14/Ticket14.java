/*
 * Copyright (c) fl_3650.
 */

package ticket14;

import java.util.*;

class Ticket14 {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        stack2.push(1);
        stack2.push(2);
        stack2.push(4);

        boolean result = equals(stack1, stack2);

        System.out.println("Equality: " + result);
    }

    static boolean equals(Stack<Integer> stack1, Stack<Integer> stack2) {
        if (stack1.size() != stack2.size()) {
            return false;
        }

        Stack<Integer> tempStack = new Stack<>();

        while (!stack1.isEmpty()) {
            int value1 = stack1.pop();
            int value2 = stack2.pop();

            tempStack.push(value1);

            if (value1 != value2) {
                restoreStack(stack1, tempStack);
                restoreStack(stack2, tempStack);
                return false;
            }
        }

        restoreStack(stack1, tempStack);
        restoreStack(stack2, tempStack);

        return true;
    }

    static void restoreStack(Stack<Integer> original, Stack<Integer> temp) {
        while (!temp.isEmpty()) {
            original.push(temp.pop());
        }
    }
}
