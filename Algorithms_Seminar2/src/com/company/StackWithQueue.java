package com.company;
//https://www.geeksforgeeks.org/implement-a-stack-using-single-queue/
//https://www.sanfoundry.com/python-program-implement-stack-using-one-queue/
//https://stackoverflow.com/questions/47850235/implementing-stack-using-a-queue-pseudocode
import java.util.LinkedList;
import java.util.Queue;

public class StackWithQueue {
    private Queue<Integer> queue;

    public StackWithQueue() {
        queue = new LinkedList<>();
    }

    public void push(int n) {
        int size = queue.size();
        queue.add(n);
        for (int i = 0; i < size; i++)
        {
            int x = queue.remove();
            queue.add(x);
        }
    }

    public int pop() {
        if (queue.isEmpty())
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        int x = queue.remove();
        return x;
    }
}
