/*
 * Copyright (c) fl_3650.
 */

package ticket15;

import java.util.*;

class Ticket15 {
    public static Stack<Integer> splitStack(Stack<Integer> s1) {
        Deque<Integer> deq = new ArrayDeque<>();
        Stack<Integer> res = new Stack<>();

        while (!s1.isEmpty()) {
            if (s1.peek() < 0) {
                deq.offerFirst(s1.pop());
            } else {
                deq.offerLast(s1.pop());
            }
        }

        while (!deq.isEmpty()) {
            res.push(deq.poll());
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

        System.out.println(splitStack(s1));
    }
}
