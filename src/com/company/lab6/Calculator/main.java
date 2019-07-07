package com.company.lab6.Calculator;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();

//        1.
        List<Integer> randomList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            randomList.add(i);
        }

        System.out.println("Valorile din lista sunt: ");

        for (int i : randomList) {
            System.out.println(i);
        }

        System.out.println('\r');

//        2.
        int i = 11;
        op.addNrToList(randomList, i);
        System.out.print("Numarul " + i + " a fost adaugat la sfarsitul listei: ");
        System.out.println(randomList);
        System.out.println('\r');

//        3.
        int Nr = 4;
        System.out.println("Numerele din lista, incepand de la pozitia " + Nr + " sunt: ");
        op.printListFromNr(randomList, Nr);
        System.out.println('\r');

//        4.
        System.out.println();
        System.out.println("Lista in ordine inversa este: ");
        op.printListBackward(randomList);
        System.out.println('\r');

//        5.
        List<String> weekDays = new ArrayList<>();
        weekDays.add("Luni");
        weekDays.add("Marti");
        weekDays.add("Miercuri");
        weekDays.add("Joi");
        weekDays.add("Sambata");
        weekDays.add("Duminica");

        String day = "Vineri";
        int nr = 4;

        System.out.println("Zilele saptamanii sunt: " + op.addStringToList(weekDays, nr, day) + ".");
        System.out.println('\r');

//        6.
        List<String> fourSeason = new ArrayList<>();
        fourSeason.add("Vara");
        fourSeason.add("Toamna");
        fourSeason.add("Iarna");

        String firstSeason = "Primavara";
        System.out.println("Cele 4 anotimpuri sunt: " + op.addToFirstIndex(fourSeason, firstSeason) + ".");
        System.out.println('\r');

//        7.
        op.printEachValueInList(randomList);
        System.out.println('\r');

//        8.
        List<Integer> randList = new ArrayList<>();
        randList.add(5);
        randList.add(2);
        randList.add(9);
        randList.add(8);
        randList.add(15);
        randList.add(6);
        randList.add(3);

        System.out.println("Cel mai mare numar din lista este: " + op.printSmallestMemberInList(randList) + ".");
        System.out.println('\r');
    }
}
