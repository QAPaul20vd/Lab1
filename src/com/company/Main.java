package com.company;

public class Main {

    public static void main(String[] args) {
        // 1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.

        System.out.println("Hello");
        System.out.println("Baciu Paul" + '\n');

        /*2. Printati rezultatul sumei a doua numere(orice numere)
          3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.*/

        int account = 75000;
        int yearSalary = 25000;

        int total = account + yearSalary;
        System.out.println("Totalul in cont pe an este: " + total + '\n');

        float monthlySal = yearSalary / 12f;
        System.out.println("Salariul pe luna este: " + monthlySal + '\n');

        /* 4. Printati rezultatul urmatoarelor operatiuni:
              a. -5 + 8 * 6 */

        byte nr1 = -5, nr2 = 8, nr3 = 6;

        System.out.println("Rezultatul la pct. 4a este: " + (nr1 + nr2 * nr3));

        //b. (55+9) % 9

        nr1 = 55;
        nr2 = 9;
        nr3 = 9;
        System.out.println("Rezultatul la pct. 4b este: " + ((nr1 + nr2) % nr3));

        //c. 20 + -3*5 / 8

        float nr1c = 20f;
        float nr2c = -3f;
        float nr3c = 5f;
        float nr4c = 8f;
        float rezultat = nr1c + nr2c * nr3c / nr4c;

        System.out.println("Rezultatul la pct. 4c este: " + rezultat);
        //sau
        System.out.println("Rezultatul la pct. 4c este: " + (20 + (-3) * 5 / 8f));

        //d. 5 + 15 / 3 * 2 - 8 % 3

        System.out.println("Rezultatul la pct. 4d este: " + (5 + 15 / 3f * 2 - 8 % 3));

    }
}
