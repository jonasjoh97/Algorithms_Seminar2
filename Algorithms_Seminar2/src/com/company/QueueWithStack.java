package com.company;
//https://stackoverflow.com/questions/12470626/how-can-one-implement-a-queue-with-only-a-stack-implementation
//https://www.geeksforgeeks.org/implement-a-stack-using-single-queue/

import java.util.Stack;

public class QueueWithStack {
    private Stack<Integer> stackQueue;


    public QueueWithStack() {
        stackQueue = new Stack();
    }

    public void enqueue(int entry) {
        stackQueue.add(entry);
    }


    public int dequeue() {
        int popInt = 0;
        if (!stackQueue.isEmpty()) {
            popInt = stackQueue.pop();
            if (!stackQueue.isEmpty()) {
                dequeue();
                stackQueue.push(popInt);
            }
        } else {
        System.out.println("Stack Underflow");
        }
        return popInt;
    }

}
