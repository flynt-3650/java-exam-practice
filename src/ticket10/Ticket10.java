/*
 * Copyright (c) Eliza
 */

package ticket10;

import java.util.*;

class Ticket15 {
    public static Stack<Integer> splitStack(Stack<Integer> s1) {
    LinkedList<Integer> list = new LinkedList<>();
    Stack<Integer> res = new Stack<>();

    while (!s1.isEmpty()) {
        if (s1.peek() < 0) {
            list.addFirst(s1.pop());
        } else {
            list.addLast(s1.pop());
        }
    }

    while (!list.isEmpty()) {
        res.push(list.removeFirst());
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