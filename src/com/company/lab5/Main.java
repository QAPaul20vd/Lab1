package com.company.lab5;

public class Main {

    public static void main(String[] args) {

//        1. Metode polimorfe

        Calculator calc = new Calculator();
        System.out.println("Rezultatul adunarii a doua numere intregi este: " + calc.addNrs(5, 10));
        System.out.println("Rezultatul adunarii a trei numere intregi este: " + calc.addNrs(5, 10, 15));
        System.out.println("Rezultatul adunarii a trei numere reale este: " + calc.addNrs(5.2f, 10.5f, 15.4f));
        System.out.println("Rezultatul adunarii a trei numere mixte este: " + calc.addNrs(5.2f, 10, 15));

        System.out.println('\n');

        System.out.println("Rezultatul scaderii a doua numere intregi este: " + calc.difNrs(5, 10));
        System.out.println("Rezultatul scaderii a trei numere intregi este: " + calc.difNrs(25, 10, 5));
        System.out.println("Rezultatul scaderii a doua numere mixte este: " + calc.difNrs(25.5f, 10));

        System.out.println('\n');

        System.out.println("Rezultatul inmultirii a doua numere intregi este: " + calc.multNrs(5, 10));
        System.out.println("Rezultatul inmultirii a patru numere intregi este: " + calc.multNrs(2, 4, 6, 8));
        System.out.println("Rezultatul inmultirii a doua numere reale este: " + calc.multNrs(5.5f, 3));

        System.out.println('\n');

        System.out.println("Rezultatul impartirii a doua numere reale este: " + calc.divNrs(20.5f, 2.5f));
        System.out.println("Rezultatul impartirii a trei numere reale este: " + calc.divNrs(100.25f, 2.4f, 5.7f));
        System.out.println("Rezultatul impartirii a doua numere intregi este: " + calc.divNrs(100, 25));

        System.out.println('\n');

        System.out.println("Restul impartirii a doua numere intregi este: " + calc.modulo(20, 6));
        System.out.println("Restul impartirii a doua numere reale este: " + calc.modulo(10.5f, 2.5f));

        System.out.println('\n');

//        ARRAY

        LogicalOp op = new LogicalOp();

//        2. Afiseaza un array de 100 de numere

        System.out.println("Array-ul de 100 de numere este:");

        int[] myArray = op.getArrayToHundred();

        for (int i = 0; i < myArray.length; i++) {
            if (i % 25 == 0)
                System.out.println('\r');
            System.out.print(myArray[i] + " ");
        }

        System.out.println('\n');

//        3. Afiseaza numerele pare dintr-un array de 100 de numere

        System.out.println("Numerele pare dintr-un array de 100 de numere sunt: ");

        int[] smallArray = new int[50];
        int[] evenArray = op.getEvenArrayToHundred(smallArray);
        for (int i = 0; i < smallArray.length; i++) {
            if (i % 25 == 0)
                System.out.println('\r');
            System.out.print(evenArray[i] + " ");
        }
        System.out.println('\n');

//        4. Afiseaza media numerelor dintr-un array

        int[] arrNumbers = {15, 20, 25, 30, 35, 40, 45, 50};
        System.out.println("Media numerelor din array-ul dat este: " + op.getAverageArray(arrNumbers));
        System.out.println('\n');

//        5. Verifica un string intr-un array de stringuri

        String[] weekDays = {"Luni", "Marti", "Miercuri", "Joi", "Vineri", "Sambata", "Duminica"};
        String strFind = "Joi";
        if (op.checkInArray(weekDays, strFind))
            System.out.println("Stringul introdus, " + strFind + ", se afla in array-ul de Stringuri.");
        else System.out.println("Stringul introdus, " + strFind + ", nu se afla in array-ul de Stringuri.");
        System.out.println('\n');

//        6. Returneaza pozitia unui numar intr-un array de numere

        int[] evenNr = {2, 4, 6, 8, 10};
        int j = 6;
        int index = op.getPositionInArray(evenNr, j);
        if (index >= 0)
            System.out.println("Numarul " + j + " se afla in array pe pozitia " + index + ".");
        else {
            System.out.println("Numarul " + j + " nu se afla in array.");
        }
//        7. Grila
        op.drawLines();

//        8. Returneaza array fara numarul dat
        int[] anArray = {10, 15, 20, 5, 4, 8, 21, 7, 6};
        int x = 20;
        int[] newArray = op.removeNrFromArray(anArray, x);
        System.out.print("Array-ul fara numarul " + x + " este: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println('\n');

//        9. Returneaza al doilea cel mai mic numar din array
        int[] randomArr = {0, 35, 2, 56, 5, 65, 9, 78, 17};
        int smallestNr = op.getSecondSmallestNrInArray(randomArr);

        System.out.println("Al doilea cel mai mic numar din array-ul dat este: " + smallestNr + "." + '\n');

//        10. Copiaza un array
        int[] randArr = {15, 35, 49, 56, 5, 65, 89, 78, 123};
        int[] emptyArray = new int[randArr.length];
        int[] newArr = op.copyArray(randArr, emptyArray);

        System.out.print("Valorile copiate din primul array sunt: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println('\n');


//        2.
        int[] myArr = {12, 45, 50, 32, 10};
        int ind = 5;
        int nr = 20;
        int[] finalArray = op.insertElement(myArr, ind, nr);
        if (ind <= myArr.length) {
            System.out.print("Array-ul final este: ");
            for (int i = 0; i < finalArray.length; i++) {
                System.out.print(finalArray[i] + " ");
            }
        } else {
            System.out.println("Indexul introdus este mai mare decat lungimea array-ului.");
        }
        System.out.println('\n');

//        3.
        op.getMinMaxFromArray(myArr);
        System.out.println('\n');

//        4.
        int[] firstArray = {4, 15, 20, 34, 45, 67};
        int[] invertedArr = op.invertArray(firstArray);

        System.out.print("Array-ul initial este: ");

        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }
        System.out.println('\r');
        System.out.print("Array-ul inversat este: ");
        for (int i = 0; i < invertedArr.length; i++) {
            System.out.print(invertedArr[i] + " ");
        }
        System.out.println('\n');


//        5.
        int[] initArray = {23, 54, 23, 34, 54, 78, 65, 98, 78};
        int[] duplicateVal = op.findDuplicate(initArray);

        System.out.print("Valorile duplicate din array-ul dat sunt: ");
        for (int i = 0; i < duplicateVal.length; i++) {
            System.out.print(duplicateVal[i] + " ");
        }
        System.out.println('\n');

//        6.


//        7.
        int[] numbers = {5, 3, 10, 8, 6, 2, 1, 4, 7, 9};
        int[] orderedNr = op.sortUpArray(numbers);

        System.out.print("Array-ul ordonat crescator este: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println('\n');

    }


}

