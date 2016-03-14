package com.dumer.stack;

/**
 * Created by rakesh.barik on 07-03-2016.
 */
public class StackTest {
    public static void main(String ar[]){
        Stack stack = new StackArray();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.push("E").toString());
        System.out.println(stack.peek());
        stack.push("D");
        stack.push("O");
        stack.push("G");
        System.out.println(stack.toString());
        /*java.util.Stack stack2 = new java.util.Stack();
        stack2.push("D");
        stack2.push("o");
        stack2.push("G");
        stack2.push("S");
        System.out.println(stack2.peek());
        System.out.println(stack2.toString());
        System.out.println(stack2.peek());*/


        Stack<String> linkedStack = new StackLinkedList<>();
        linkedStack.push("!");
        linkedStack.push(" World");
        linkedStack.push("Hello");
        System.out.println(linkedStack.toString());

    }
}
