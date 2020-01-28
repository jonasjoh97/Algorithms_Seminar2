package com.company;

//https://www.geeksforgeeks.org/josephus-problem-set-1-a-on-solution/
//https://www.roytuts.com/solving-josephus-problem-using-java/

import java.util.*;

public class Task2 {

    private Scanner scanner = new Scanner(System.in);
    private Timer timer = new Timer();


    public void task2Control() {
        boolean running = true;
        int n = 0;
        int m = 0;
        try {
            while (running) {
                System.out.println("--------------------TASK 2-------------------- ");
                System.out.println("1. ArrayList");
                System.out.println("2. LinkedList");
                System.out.println("3. Iterator");
                System.out.println("4. back to main menu");
                int menu = scanner.nextInt();
                if (menu != 4) {
                    System.out.println("Input n");
                    scanner.nextLine();
                    n = scanner.nextInt();
                    System.out.println("Input m");
                    scanner.nextLine();
                    m = scanner.nextInt();
                }
                switch (menu) {
                    case 1:
                        timer.startTimer();
                        josephusArrayList(n, m);
                        break;
                    case 2:
                        timer.startTimer();
                        josephusLinkedList(n, m);
                        break;
                    case 3:
                        timer.startTimer();
                        josephusItaretor(n, m);
                        break;
                    case 4:
                        running = false;
                }
                timer.stopTimer();
                System.out.println("It took " + timer.toString() + " seconds to complete");
            }
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input! Please enter an integer which is on the menu!");
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Something went wrong!");
            System.err.println(e);
        }
    }


    private void josephusArrayList(int n, int m) {
        int counter;


        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrayList.add(i + 1);
        }
        counter = m;

        System.out.print("the order is: ");

        while (arrayList.size() > 1) {

            System.out.print(arrayList.remove(counter) + "  ");

            if (0 < arrayList.size()) {
                counter = (counter + m) % arrayList.size();
            }

        }
        System.out.println();
        System.out.println("Winner is: " + arrayList.get(counter));

    }

    private void josephusLinkedList(int n, int m) {
        int counter;
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        for (int i = 0; i < n; i++) {
            linkedList.add(i + 1);
        }
        counter = m;

        System.out.print("the order is: ");

        while (linkedList.size() > 1) {

            System.out.print(linkedList.remove(counter) + "  ");

            if (0 < linkedList.size()) {
                counter = (counter + m) % linkedList.size();
            }

        }
        System.out.println();
        System.out.println("Winner is: " + linkedList.get(counter));

    }

    private void josephusItaretor(int n, int m) {

        LinkedList<Integer> list = new LinkedList<>();

        for (int index = 0; index < n; index++) {
            list.add(index + 1);
        }

        Iterator<Integer> it = new CircularList(list);

        System.out.print("the order is: ");

        while (n-- > 1) {

            for (int i = 0; i < m; i++) {
                it.next();
            }

            System.out.print(it.next() + ", ");
            it.remove();
        }

        System.out.println();
        System.out.println("Winner is: " + it.next());
    }


}
