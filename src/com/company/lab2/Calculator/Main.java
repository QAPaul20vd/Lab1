package com.company.lab2.Calculator;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        printName();

        int resOp1 = op1(-5, 8, 6);
        System.out.println("Rezultatul primei ecuatii este: " + resOp1);

        int resOp2 = op2(55, 9);
        System.out.println("Rezultatul celei de-a doua ecuatii este: " + resOp2);

        float resOp3 = op3(20, -3, 5, 8);
        System.out.println("Rezultatul celei de-a treia ecuatii este: " + resOp3);

        float resOp4 = op4(5, 15, 3, 2, 8);
        System.out.println("Rezultatul celei de-a patra ecuatii este: " + resOp4);

        int addRes = addNrs(35, 65);
        System.out.println("Rezultatul adunarii este: " + addRes + "." + '\n');

        System.out.println("Rezultatul scaderii este: " + difNrs(10, 5) + "." + '\n');

        int resMult = multNrs(10, 5);
        System.out.println("Rezultatul inmultirii este: " + resMult + "." + '\n');

        float resDiv = divNrs(50, 7);
        System.out.println("Rezultatul impartirii este: " + resDiv + "." + '\n');

        drawJava();

        float resMean = meanNrs(4, 5, 7);
        System.out.println("Media numerelor este: " + resMean + "." + '\n');

        drawFace();

        int resmodulo = modulo(30, 4);
        System.out.println("Restul impartirii numerelor este: " + resmodulo + "."+ '\n');

        float degreeCelsius = FahtoCelsius(120);
        System.out.println("Temperatura in grade Celsius este: " + degreeCelsius + "."+ '\n');

        float distM = inchToM(50.5f);
        System.out.println("Distanta in Metri este: " + distM + "." + '\n');


        float speedNum = speedmps(100000f, 1, 20, 15);
        System.out.println("Viteza in metri pe secunda este: " + speedNum + ".");
        System.out.println("Viteza in km pe ora este: " + mpsToKmph(speedNum) + ".");
        System.out.println("Viteza in mile pe ora este: " + mpsToMph(speedNum) + ".");

    }

    //1. Pentru exercitiile din clasa main() de data trecuta, creati metode separate pentru fiecare, tot in clasa Main.java, si apoi apelati-le in metoda main().

    public static void printName() {
        System.out.println("Hello \n Baciu Paul");
    }

    //    a. -5 + 8 * 6
    public static int op1(int nr1, int nr2, int nr3) {
        int x = nr1 + nr2 * nr3;
        return x;
    }

    //b. (55+9) % 9

    public static int op2(int nr1, int nr2) {
        int x = (nr1 + nr2) % nr2;
        return x;
    }

    //c. 20 + -3*5 / 8

    public static float op3(float nr1, float nr2, float nr3, float nr4) {
        float x = nr1 + nr2 * nr3 / nr4;
        return x;
    }

    //d. 5 + 15 / 3 * 2 - 8 % 3

    public static float op4(float nr1, float nr2, float nr3, float nr4, float nr5) {
        float x = nr1 + nr2 / nr3 * nr4 - nr5 % nr3;
        return x;
    }

    /*2. Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.
    Fiecare metoda ar trebui sa primeasca doi parametrii de tip numar, sa execute operatia, si sa returneze rezultatul. Apoi apelati metoda in main cu valorile cu care doriti sa executati operatia*/

    public static int addNrs(int nr1, int nr2) {
        int x = nr1 + nr2;
        return x;
    }

    public static int difNrs(int nr1, int nr2) {
        int x = nr1 - nr2;
        return x;
    }

    public static int multNrs(int nr1, int nr2) {
        int x = nr1 * nr2;
        return x;
    }

    public static float divNrs(float nr1, float nr2) {
        float y = nr1 / nr2;
        return y;
    }
    //3. Scrieti o metoda java, care sa afiseze urmatorul model:

    public static void drawJava() {
        System.out.println("   J    a    v     v    a");
        System.out.println("   J   a a    v   v    a a");
        System.out.println("J  J  aaaaa    v v    aaaaa");
        System.out.println(" JJ  a     a    v    a     a");
    }

    //4. Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.

    public static float meanNrs(int nr1, int nr2, int nr3) {
        float x = (nr1 + nr2 + nr3) / 3f;
        return x;
    }
    //5. Scrieti o metoda java, care sa afiseze urmatorul model:

    public static void drawFace() {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | \'-\' | ");
        System.out.println(" +-----+ ");
    }

    //6. Scrieti o metoda java, care sa returneze restul impartirii a doua numere

    public static int modulo(int nr1, int nr2) {
        int x = nr1 % nr2;
        return x;
    }

    /*7. Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit,
     si sa returneze temperatura in Celsius. Formula de calcul este: C = 5/9 * (F -32)*/

    public static float FahtoCelsius(float nr1) {
        float x = (5 / 9f) * (nr1 - 32);
        return x;
    }
    //8. Scrieti o metoda java, care sa primeasca ca si parametru un numar real, care sa reprezinte distanta in inch, si sa returneze distanta in metrii

    public static float inchToM(float inch) {
        float x = inch * 0.0254f;
        return x;
    }

    /*9.Scrieti o metoda java, care primeste distanta (in metrii) si timpul (ca si 3 numere: ore, minute, secunde),
    si afiseaza viteza, in metrii pe secunda, kilometrii pe ora si mile pe ora. (Indiciu: 1 mila = 1609 metrii)*/
    public static int getSeconds(int ora, int minute, int secunde) {
        return secunde + minute * 60 + ora * 3600;
    }

    public static float speedmps(float m, int h, int min, int sec) {
        int time = getSeconds(h, min, sec);
        float viteza = m / time;
        return viteza;
    }

    public static float mpsToKmph(float mps) {
        return mps * 3.6f;
    }

    public static float mpsToMph(float mps) {
        return mps * 2.2369362921f;
    }
}

