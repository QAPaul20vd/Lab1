package com.company;

public class Main {

    public static void main(String[] args) {
        // 1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.

        System.out.println("Hello");
        System.out.println("Baciu Paul");

        //2. Printati rezultatul sumei a doua numere(orice numere)
        //3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.

        int account = 75000;
        int yearSalary = 25000;

        int total = account + yearSalary;
        System.out.println("Totalul in cont pe an este: " + total);

        float monthlySal = yearSalary / 12f;
        System.out.println("Salariul pe luna este: " + monthlySal);

        //4. Printati rezultatul urmatoarelor operatiuni:
        //a. -5 + 8 * 6

        byte nr1 = -5;
        byte nr2 = 8;
        byte nr3 = 6;
        System.out.println(nr1 + nr2 * nr3);

        //b. (55+9) % 9
        nr1 = 55;
        nr2 = 9;
        nr3 = 9;
        System.out.println((nr1 + nr2) % nr3);

        //c. 20 + -3*5 / 8
        nr1 = 20;
        nr2 = -3;
        nr3 = 5;
        byte nr4 = 8;
        double rezultat = nr1 + nr2 * nr3 / nr4;
        System.out.println(rezultat);

        //d. 5 + 15 / 3 * 2 - 8 % 3
        System.out.println((5 + 15 / 3 * 2- 8) % 3);

    }
}
