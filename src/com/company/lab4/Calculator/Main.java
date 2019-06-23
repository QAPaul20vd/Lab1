package com.company.lab4.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();

//        System.out.println("Numaratoarea pana la 100 este:");
//        op.printTo100(95);
//        System.out.println('\n');
//
//        System.out.println("Numaratoarea pana la - 100 este:");
//        op.printToMinus100(-90);
//        System.out.println('\n');
//
//        System.out.println("Numaratoarea intre doua numere date este:");
//        op.printCountBetweenNumbers(5, 10);
//        System.out.println('\n');
//
//        System.out.println("Numaratoarea crescatoare intre doua numere este:");
//        op.printCountToHighest(10, 3);
//        System.out.println('\n');
//
//        System.out.println("Numerele pare de la 1 la 100 sunt:");
//        op.printCountEvenNr();
//        System.out.println('\n');
//
//        System.out.println("Numerele impare de la 1 la 100 sunt:");
//        op.printCountOddNr();
//        System.out.println('\n');
//
//        System.out.println("Suma numerelor pornind de la un numar pana la 100 este:");
//        System.out.println(op.SumTo100(1));
//        System.out.println('\n');
//
//        System.out.println("Media numerelor pornind de la un numar pana la 100 este:");
//        System.out.println(op.SumTo100AndAverage(1));
//        System.out.println('\n');
//
//        System.out.println("Tiparul cu stelute este:");
//        op.drawStars();

        //***************************************************************************

        System.out.println("Numaratoarea pana la 100 este:");
        op.printTo100While(80);
//        op.printTo100DoWhile(102);
        System.out.println('\n');

        System.out.println("Numaratoarea pana la - 100 este:");
        op.printToMinus100While(-97);
//        op.printToMinus100DoWhile(-105);
        System.out.println('\n');

        System.out.println("Numaratoarea intre doua numere date este:");
        op.printCountBetweenNumbersWhile(5, 9);
//        op.printCountBetweenNumbersDoWhile(5, 10);
        System.out.println('\n');

        System.out.println("Numaratoarea crescatoare intre doua numere este:");
        op.printCountToHighestWhile(10, 3);
        System.out.println('\n');

        System.out.println("Numerele pare de la 1 la 100 sunt:");
        op.printCountEvenNrWhile();
//        op.printCountEvenNrDoWhile();
        System.out.println('\n');

        System.out.println("Numerele impare de la 1 la 100 sunt:");
        op.printCountOddNrWhile();
        System.out.println('\n');

        op.intervalMeanWhile();
        System.out.println('\n');

        System.out.println("Media numerelor divizibile cu 7 din intervalul dat este:");
        System.out.println(op.meanBy7(21, 1));
        System.out.println('\n');

        System.out.println("Primele 20 de numere din sirul lui Fibonacci sunt:");
        op.first20NrOfFibonacci();
        System.out.println('\n');

        System.out.println("Metoda CozaLozaWoza este:");
        op.cozaLozaWoza();
        System.out.println('\n');

    }
}
