package com.company;
//https://stackoverflow.com/questions/688276/implement-stack-using-two-queues
//https://www.includehelp.com/data-structure-tutorial/implementation-of-stack-using-two-queues.aspx
//https://www.geeksforgeeks.org/implement-stack-using-queue/

import java.util.LinkedList;
import java.util.Queue;

public class StackTwoQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackTwoQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();

    }



    public void push(int n) {

        //If empty add n to the queue
        if (queue1.peek() == null) {
            queue1.add(n);
        } else {
            for (int i = queue1.size(); i > 0; i--) {
                queue2.add(queue1.remove());
            }
            queue1.add(n);
            for (int j = queue2.size(); j > 0; j--) {
                queue1.add(queue2.remove());
            }

        }
    }
    public int pop() {
        if (queue1.peek() == null) {
            System.out.println("Stack Underflow");
            int i = 0;
            return i;
        } else {
            int pop = queue1.remove();
            return pop;
        }
    }
}
