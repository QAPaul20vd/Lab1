package com.company.lab7.Calculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        Read read = new Read();


//        1.
//        System.out.print("Introdu un numar intreg: ");
//        System.out.println("Numarul introdus este: " + read.getInt() + ".");

//        2.
//        System.out.print("Introdu un numar real: ");
//        System.out.println("Numarul introdus este: " + read.getFloat() + ".");
//
//        System.out.print("Introdu un numar Double: ");
//        System.out.println("Numarul introdus este: " + read.getDouble() + ".");
//
//        System.out.print("Introdu un numar Long: ");
//        System.out.println("Numarul introdus este: " + read.getLong() + ".");
//
//        System.out.print("Introdu un String: ");
//        System.out.println("String-ul introdus este: " + read.getString() + ".");

//        3.

        boolean repeat;
        do {
            try {
                System.out.print("Introduceti lungimea array-ului: ");
                Scanner scan = new Scanner(System.in);
                int length = scan.nextInt();
                int[] myArray = read.getArray(length);
                System.out.print("Array-ul introdus este: ");
                for (int i = 0; i < myArray.length; i++) {
                    System.out.print(myArray[i] + " ");
                }
                repeat = false;
            } catch (InputMismatchException error) {
                repeat = true;
                System.out.println("Not a number, try again!");
            }
        } while (repeat);


//        4.


    }
}
