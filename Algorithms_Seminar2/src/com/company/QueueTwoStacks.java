package com.company;
//https://www.geeksforgeeks.org/queue-using-stacks/
//https://stackoverflow.com/questions/69192/how-to-implement-a-queue-using-two-stacks

import java.util.Stack;

public class QueueTwoStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueTwoStacks(){
        stack1 = new Stack();
        stack2 = new Stack();
    }

    public void enqueue(int n) {
        stack1.push(n);
    }

    // implement dequeue method by pushing all elements from stack 1 into stack 2 and then popping from stack 2
    public int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.err.println("Stack Underflow");
                return 0;
            }
            while (stack1.size() > 0) {
                var p = stack1.pop();
                stack2.push(p);
            }
        }
        return stack2.pop();
    }
}
