/*
 * Copyright (c) Eliza
 */

package ticket10;

import java.util.Iterator;
import java.util.Stack;

class Ticket10 {
    public static Stack<Integer> splitStack(Stack<Integer> stack){
        Stack<Integer> positiveNumbers = new Stack<>();
        Stack<Integer> negativeNumbers = new Stack<>();
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()){
            Integer number = iterator.next();
            if(number < 0){
                negativeNumbers.push(number);
                iterator.remove();
            } else {
                positiveNumbers.push(number);
                iterator.remove();

            }
        }


        stack.addAll(negativeNumbers);
        stack.addAll(positiveNumbers);

        return stack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        stack.push(2);
        stack.push(-8);
        stack.push(10);
        stack.push(11);
        stack.push(0);
        stack.push(-6);
        stack.push(-95);
        System.out.println( splitStack(stack));

    }
}
