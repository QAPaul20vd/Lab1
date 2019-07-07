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
        int Nr = 6;
        if (randomList.contains(Nr)) {
            System.out.println("Numerele din lista, incepand cu numarul " + Nr + " sunt:");
            op.printListFromNr(randomList, Nr);
            System.out.println('\r');
        } else
            System.out.println("Numarul introdus nu face parte din lista data.");

//        4.
        System.out.println('\r');
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

        if (nr <= weekDays.size()) {
            System.out.println("Zilele saptamanii sunt: " + op.addStringToList(weekDays, nr, day) + ".");
            System.out.println('\r');
        } else
            System.out.println("Numarul introdus este in afara lungimii listei. Introdu un numar valid intre 0 si " + weekDays.size()+"!");

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

        //*********************************<<_____O P T I O N A L E____>>***********************************************

//        1.
        int a = 3;
        int b = 7;
        if (randomList.contains(a) && randomList.contains(b)) {
            List<Integer> changedList = op.changePositionInList(randomList, a, b);
            System.out.print("Lista cu ordinea schimbata este: ");
            for (int x : changedList) {
                System.out.print(x + " ");
            }
            System.out.println('\r');
        } else
            System.out.println("Numerele introduse nu fac parte din lista data.");
        System.out.println('\r');


//        2.
        List<Integer> evenList = op.returnEvenList(randomList);
        System.out.print("Numerele pare din lista data sunt: ");
        for (int z : evenList) {
            System.out.print(z + " ");
        }
        System.out.println('\n');

//        3.
        List<Integer> sortedList = op.sortedList(randList);
        System.out.print("Lista sortata crescator este: ");
        for (int n : sortedList) {
            System.out.print(n + " ");
        }
    }
}
