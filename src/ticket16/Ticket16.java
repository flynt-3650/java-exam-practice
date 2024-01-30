/*
 * Copyright (c) Eliza
 */

package ticket16;

import java.util.*;

class Ticket16 {
    public static Stack<Integer> copyStack(Stack<Integer> s) {
        Stack<Integer> res = new Stack<>();
        Deque<Integer> deq = new ArrayDeque<>();

        while (!s.isEmpty()) {
            deq.offerLast(s.pop());
        }

        while (!deq.isEmpty()) {
            Integer item = deq.pollLast();
            s.push(item);
            res.push(item);
        }
        return res;
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();

        s1.push(1);
        s1.push(-2423423);
        s1.push(13);
        s1.push(-115);
        s1.push(1767);
        System.out.println(s1);

        Stack<Integer> newStack = copyStack(s1);
        System.out.println(newStack);
    }
}
