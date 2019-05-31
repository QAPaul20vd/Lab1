package com.company.lab2.Calculator;

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

        float resMean = meanNrs(4, 5, 7);
        System.out.println("Media numerelor este: " + resMean + "." + '\n');

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

    public static float meanNrs(int nr1, int nr2, int nr3) {
        float x = (nr1 + nr2 + nr3) / 3f;
        return x;
    }
}

