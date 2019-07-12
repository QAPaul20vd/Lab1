package com.company.lab7.App;

import com.company.lab7.Calculator.Read;
import com.company.lab5.Calculator;


public class Run {
    private Read read = new Read();
    private Calculator calc = new Calculator();


    private void printMenu() {
        System.out.println("Hello!\n" +
                "Please select a value from the menu:\n" +
                "1. Sum\n" +
                "2. Difference\n" +
                "3. Multiply");

    }

    private boolean selectItemFromMenu() {
        System.out.print("Please select menu number: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                sum();
                return true;
            case 2:
                dif();
                return true;

            case 0:
                System.out.println("Bye!");
                return false;
            default:

                System.out.println("Try again!");
                return true;
        }

    }

    public void runProgram() {
        do {
            printMenu();

        } while (selectItemFromMenu());
    }


    private void sum() {
        System.out.print("Please enter the first number: ");
        int first = read.getInt();
        System.out.print("Please enter the second number: ");
        int second = read.getInt();
        System.out.println("The sum is: " +
                calc.addNrs(first, second));
    }

    private void dif() {
        System.out.print("Please enter the first number: ");
        int first = read.getInt();
        System.out.print("Please enter the second number: ");
        int second = read.getInt();
        System.out.println("The difference is: " +
                calc.difNrs(first, second));
    }
}

