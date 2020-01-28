package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    private Scanner scanner = new Scanner(System.in);

    public void task3Control() {
        boolean running = true;
        try {
            while (running) {
                System.out.println("--------------------TASK 4-------------------- ");
                System.out.println("1. Queue using two Stacks");
                System.out.println("2. Queue using one Stack");
                System.out.println("3. Stack using Two Queues");
                System.out.println("4. Stack using on");
                System.out.println("5. back to main menu");
                int menu = scanner.nextInt();
                System.out.println();
                try {
                    switch (menu) {
                        case 1:
                            option1();
                            break;
                        case 2:
                            option2();
                            break;
                        case 3:
                            option3();
                            break;
                        case 4:
                            option4();
                            break;
                        case 5:
                            running = false;
                    }
                } catch (IndexOutOfBoundsException e) {
                    System.err.println("Index out of bonds, please try again");
                }


            }
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input! Please enter an integer which is on the menu!");
        }
    }

    private void option1() {
        QueueTwoStacks queueTwoStacks = new QueueTwoStacks();
        boolean running1 = true;
        try {
            while (running1) {
                System.out.println("-----------------Queue using two Stacks----------------- ");
                System.out.println("1. Enqueue");
                System.out.println("2. Dequeue");
                System.out.println("3. return to previous menu");
                int menu = scanner.nextInt();
                System.out.println();

                switch (menu) {
                    case 1:
                        System.out.println("Enter an integer to enqueue");
                        int n = scanner.nextInt();
                        queueTwoStacks.enqueue(n);
                        break;
                    case 2:
                        System.out.println("The Integer removed is: " + queueTwoStacks.dequeue());
                        break;
                    case 3:
                        running1 = false;
                }
                if (menu != 3) {
                    System.out.println("Press ENTER to continue");
                    scanner.nextLine();
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input! Please enter an integer which is on the menu!");
        }
    }

    private void option2() {

        QueueWithStack queueWithStack = new QueueWithStack();
        boolean running2 = true;
        try {
            while (running2) {
                System.out.println("-----------------Queue using one Stacks----------------- ");
                System.out.println("1. Enqueue");
                System.out.println("2. Dequeue");
                System.out.println("3. return to previous menu");
                int menu = scanner.nextInt();
                System.out.println();

                switch (menu) {
                    case 1:
                        System.out.println("Enter an integer to enqueue");
                        int n = scanner.nextInt();
                        queueWithStack.enqueue(n);
                        break;
                    case 2:
                        System.out.println("The Integer removed is: " + queueWithStack.dequeue());
                        break;
                    case 3:
                        running2 = false;
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input! Please enter an integer which is on the menu!");
        }
    }

    private void option3() {
        StackTwoQueues stackTwoQueues = new StackTwoQueues();
        boolean running3 = true;
        try {
            while (running3) {
                System.out.println("-----------------Stack using two queues----------------- ");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. return to previous menu");
                int menu = scanner.nextInt();
                System.out.println();

                switch (menu) {
                    case 1:
                        System.out.println("Enter an integer push enqueue");
                        int n = scanner.nextInt();
                        stackTwoQueues.push(n);
                        break;
                    case 2:
                        System.out.println("The Integer removed is: " + stackTwoQueues.pop());
                        break;
                    case 3:
                        running3 = false;
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input! Please enter an integer which is on the menu!");
        }
    }

    private void option4() {
        StackTwoQueues stackWithQueue = new StackTwoQueues();
        boolean running4 = true;
        try {
            while (running4) {
                System.out.println("-----------------Stack using two queues----------------- ");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. return to previous menu");
                int menu = scanner.nextInt();
                System.out.println();

                switch (menu) {
                    case 1:
                        System.out.println("Enter an integer push enqueue");
                        int n = scanner.nextInt();
                        stackWithQueue.push(n);
                        break;
                    case 2:
                        System.out.println("The Integer removed is: " + stackWithQueue.pop());
                        break;
                    case 3:
                        running4 = false;
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input! Please enter an integer which is on the menu!");
        }
    }
}
