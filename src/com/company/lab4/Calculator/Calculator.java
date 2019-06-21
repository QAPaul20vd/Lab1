package com.company.lab4.Calculator;

public class Calculator {
    public int addNrs(int nr1, int nr2) {
        int x = nr1 + nr2;
        return x;
    }

    public int difNrs(int nr1, int nr2) {
        int x = nr1 - nr2;
        return x;
    }

    public int multNrs(int nr1, int nr2) {
        int x = nr1 * nr2;
        return x;
    }

    public float divNrs(float nr1, float nr2) {
        float y = nr1 / nr2;
        return y;
    }

    public static int modulo(int nr1, int nr2) {
        int x = nr1 % nr2;
        return x;
    }


}