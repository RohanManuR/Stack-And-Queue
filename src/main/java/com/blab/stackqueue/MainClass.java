package com.blab.stackqueue;

// main class to execute stack and queue
public class MainClass {
    public static void main(String[] args) {

        // stack object created
        Stack stack = new Stack();
        // pushing the data's to stack from top
        stack.push(70);
        stack.push(30);
        stack.push(57);
        // display stack elements
        System.out.println(stack);

        // peek method
        System.out.println(stack.peek());

        // pop method
        System.out.println(stack.pop());
        System.out.println(stack);

    }
}
