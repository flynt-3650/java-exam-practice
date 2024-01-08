/*
 * Copyright (c) Eliza
 */

package ticket16;
import java.util.Stack;
class StackManipulation {
    public Stack<Integer> copyStack(Stack<Integer> stack) {
        Stack<Integer> stackHelper = new Stack<>();
        Stack<Integer> stackFinal = new Stack<>();
        while(!stack.isEmpty()) {
            stackHelper.push(stack.pop());
        }
        while (!stackHelper.isEmpty()) {
            int element = stackHelper.pop();
            stack.push(element); // восстановление изначального стека (не обязательно)
            stackFinal.push(element);
        }
        return stackFinal;
    }

    public static void main(String[] args) {
        StackManipulation stackManipulation = new StackManipulation();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        // Копирование стека
        Stack<Integer> copiedStack = stackManipulation.copyStack(stack);
        System.out.println("origin stack");
        for(Integer element: stack) {
            System.out.print(element + " ");

        }
        System.out.println("\nstack after using copyStack");
        for(Integer element: copiedStack) {
            System.out.print(element + " ");
        }
//        System.out.println(stack); так тоже можно печатать
//        System.out.println(copiedStack);
    }

}
