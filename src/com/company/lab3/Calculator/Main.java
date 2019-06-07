package com.company.lab3.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //1.
        Calculator basicCalc = new Calculator();
        System.out.println(basicCalc.addNrs(23, 45));

        //3.
        LogicalOp operatiiLogice = new LogicalOp();
        int biggest = operatiiLogice.checkBiggerNumber(10, 50);
        System.out.println("The bigger number is: " + biggest);

        //4.
        String test1 = "Un text oarecare";
        String rezultat = operatiiLogice.compareText(test1);
        System.out.println(rezultat);

        //5.
        String text = "FastTrackIT";
        int a = 3;
        System.out.println(operatiiLogice.compTextAndNr(text, a));

        //6.
        int s = 10;
        System.out.println(operatiiLogice.snow(s));

        //7.
        int n = 2;
        System.out.println((operatiiLogice.compareNr(n)));

        //8.
        System.out.println("Introdu un numar de la 1 la 5:");
        Scanner scanNr = new Scanner(System.in);
        if (scanNr.hasNextInt()) {
            int nr = scanNr.nextInt();
            operatiiLogice.readNr(nr);
        } else {
            System.out.println("Introdu doar numere.");
        }

        //9.
        System.out.println("Introdu un numar:");
        int z = scanNr.nextInt();
        if (operatiiLogice.isNumberEven(z)) {
            System.out.println("Numarul introdus este par.");
        } else {
            System.out.println("Numarul introdus este impar.");
        }

        //10.
        System.out.println("Introdu varsta persoanei:");
        int y = scanNr.nextInt();
        if (operatiiLogice.isEligibleToVote(y)) {
            System.out.println("Persoana poate vota.");
        } else {
            System.out.println("Persoana nu are drept de vot.");
        }

        //11.
        System.out.println("Introdu trei numere:");
        int q = scanNr.nextInt();
        int r = scanNr.nextInt();
        int t = scanNr.nextInt();
        System.out.println("Cel mai mare numar este: " + operatiiLogice.biggestNr(q, r, t));

    }

}
