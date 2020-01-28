package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();


        boolean running = true;
        try {
            while (running) {
                System.out.println("--------------------SEMINAR 2-------------------- ");
                System.out.println("1. Task 1");
                System.out.println("2. Task 2");
                System.out.println("3. Task 3");
                System.out.println("4. Task 4");
                System.out.println("5. Exit program");
                int menu = scanner.nextInt();
                System.out.println();

                switch (menu) {
                    case 1:
                        task1.task1Control();
                        break;
                    case 2:
                        task2.task2Control();
                        break;
                    case 3:
                        task3.task3Control();
                        break;
                    case 4:
                        task4.task4Control();
                        break;
                    case 5:
                        running = false;
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input! Please enter an integer which is on the menu!");
        }


    }
}
