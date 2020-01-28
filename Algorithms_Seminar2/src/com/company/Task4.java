package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    private Scanner scanner = new Scanner(System.in);
    private MyLinkedList<String> linkedList = new MyLinkedList<>();

    public void task4Control() {
        boolean running = true;
        try {
            while (running) {
                System.out.println("--------------------TASK 4-------------------- ");
                System.out.println("1. Add node");
                System.out.println("2. Remove node");
                System.out.println("3. Get node from index");
                System.out.println("4. Print list");
                System.out.println("5. back to main menu");
                int menu = scanner.nextInt();
                System.out.println();
                try {
                    switch (menu) {
                        case 1:
                            System.out.println("Input Name and address");
                            String in = scanner.nextLine();
                            linkedList.add(in);
                            break;
                        case 2:
                            System.out.println("Input index to remove");
                            int n = scanner.nextInt();
                            linkedList.remove(n);
                            break;
                        case 3:
                            System.out.println("Input index to get");
                            n = scanner.nextInt();
                            System.out.println(linkedList.get(n));
                            break;
                        case 4:
                            printList();
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

    private void printList() {
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(i + ". " + linkedList.get(i));
        }
    }


}
