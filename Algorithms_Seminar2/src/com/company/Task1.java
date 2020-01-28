package com.company;
//https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
//https://learnersbucket.com/examples/algorithms/balanced-parentheses/
//https://www.faceprep.in/balanced-parenthesis-checker/


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Task1 {

    private Scanner scanner = new Scanner(System.in);

    public void task1Control() {
        boolean running = true;
        try {
            while (running) {
                System.out.println("--------------------TASK 1--------------------");
                System.out.println("1. C");
                System.out.println("2. C++");
                System.out.println("3. back to main menu");
                int menu = scanner.nextInt();
                if (menu != 3) {
                    System.out.println("input your code");
                }
                String input = scanner.nextLine();
                System.out.println();
                switch (menu) {
                    case 1:
                        System.out.println(checkC(input));
                        break;
                    case 2:
                        System.out.println(checkCplus(input));
                        break;
                    case 3:
                        running = false;
                }


            }
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input! Please enter an integer which is on the menu!");
        }
    }


    private boolean checkC(String input) throws ArrayIndexOutOfBoundsException {
        char[] array = stringToArray(input);
        boolean comment = false;

        Stack stack = new Stack();

        for (int i = 0; i < array.length; i++) {

            if (array[i] == '/') {
                if (array[i + 1] == '/') {
                    return stack.isEmpty();
                }
                if (array[i + 1] == '*') {
                    comment = true;
                }
            }

            if (array[i] == '[' || array[i] == '{') {
                stack.push(array[i]);
            }

            if (array[i] == ']' || array[i] == '}') {

                if (stack.isEmpty()) {
                    return false;
                }

                if (checkPair(stack.pop().toString().charAt(0), array[i])) {
                    return false;
                }
            }
            while (comment) {

                if (array[i] == '*') {
                    if (array[i + 1] == '/') {
                        comment = false;
                    }
                }
                i++;
                if (i == array.length) {
                    return false;
                }

            }

        }
        return stack.isEmpty();
    }

    private boolean checkCplus(String input) throws ArrayIndexOutOfBoundsException {
        char[] array = stringToArray(input);
        Stack stack = new Stack();

        for (int i = 0; i < array.length; i++) {

            if (array[i] == '/') {
                if (array[i + 1] == '/') {
                    return true;
                }
            }

            if (array[i] == '[' || array[i] == '{' || array[i] == '(') {
                stack.push(array[i]);
            }

            if (array[i] == ']' || array[i] == '}' || array[i] == ')') {

                if (stack.isEmpty()) {
                    return false;
                }

                if (checkPair(stack.pop().toString().charAt(0), array[i])) {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }

    private char[] stringToArray(String input) {
        char[] array = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            array[i] = input.charAt(i);
        }
        return array;
    }

    private boolean checkPair(char char1, char char2) {
        if (char1 == '(' && char2 == ')')
            return false;
        else if (char1 == '{' && char2 == '}')
            return false;
        else if (char1 == '[' && char2 == ']')
            return false;
        else
            return true;
    }


}
