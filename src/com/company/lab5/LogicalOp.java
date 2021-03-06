package com.company.lab5;

public class LogicalOp {

    /*3. In clasa LogicalOp, creati o metoda de tip int, care sa se numeasca checkBiggerNumber(),
    si sa primeasca doua int-uri ca si parametrii. Folosind if - else, verificati in interiorul metode
    care numar este mai mare, dintre cele doua valori care va vin ca si parametrii, si returnati numarul mai mare.*/

    public int checkBiggerNumber(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }

    }
    /*4.Creati o metoda de tip String, care sa primeasca un parametru de tip String.
        Verificati daca textul ce vine ca si parametru este egal cu “FastTrackIT”.
        Daca da, atunci metoda sa returneze “Learning text comparison”.
        Daca nu, atunci metoda sa returneze “Got to try some more”.*/

    public String compareText(String text1) {
        if (text1.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }
    /*5.Creati o metoda de tip String, care sa primeasca un parametru de tip String, si un parametru de tip int.
        Daca textul primit ca si parametru este egal cu “FastTrackIT”, si numarul primit ca si parametru
        este mai mic sau egal cu 3, returnati textul si numarul, in ordinea asta.
        Daca textul nu este “FastTrackIT” si numarul este mai mare sau egal cu 4,
        returnati numarul si textul, in ordinea asta. Apelati metoda in main() pentru a verifica daca functioneaza.*/

    public String compTextAndNr(String text, int a) {
        if (text.equals("FastTrackIT") && a <= 3) {
            return text + '\t' + a;
        } else if (!text.equals("FastTrackIT") && a >= 4) {
            return a + '\t' + text;
        } else {
            return "Valorile introduse nu sunt valide.";
        }
    }

    /*6.Creati o metoda de tip String, care sa primeasca un parametru de tip int.
        Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze
        “The amount of snow this winter was(cm): “ si numarul.
        Daca nu, sa printeze “The forecast snow is(cm): ” si numarul.
        Apelati metoda in main() pentru a verifica daca functioneaza.*/

    public String snow(int s) {
        if (s > 8 || s == 6) {
            return "The amount of snow this winter was(cm): " + s;
        } else {
            return "The forecast snow is(cm): " + s;
        }
    }

    /*7.Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
        Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
        Daca numarul este egal cu 4, returnati “The number is equal to 4”,
        iar daca numarul este mai mic de 3 returnati “The number is lower than 3”.
        Apelati metoda in main() pentru a verifica daca functioneaza.*/

    public String compareNr(int n) {
        if (n > 3 && n != 4) {
            return "The number is greater than 3 and not equal to 4.";
        } else if (n == 4) {
            return "The number is equal to 4.";
        } else {
            return "The number is lower than 3.";
        }
    }

    /*8.Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
        Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !"
        unde x trebuie sa reprezinte numarul apasat. Pentru exemplul de fata sa nu se foloseasca concatenarea
        stringului "The number is:" cu numarul de la parametru, ci sa se scrie intreg textul cu tot cu numar
        pentru fiecare caz din Switch-Case. Apelati metoda in main() pentru a verifica daca functioneaza.*/


    public void readNr(int nr) {

        switch (nr) {
            case 1:
                System.out.println("The number is 1.");
                break;
            case 2:
                System.out.println("The number is 2.");
                break;
            case 3:
                System.out.println("The number is 3.");
                break;
            case 4:
                System.out.println("The number is 4.");
                break;
            case 5:
                System.out.println("The number is 5.");
                break;
            default:
                System.out.println("Introdu doar numere de la 1 la 5.");
                break;
        }

    }

    /*9.Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru un numar,
        si sa returneze adevarat sau fals. Daca numarul e par sa returneze true iar daca e impar sa returneze false.
        Apelati metoda in main() pentru a verifica daca functioneaza.*/

    public boolean isNumberEven(int z) {
        if (z % 2 == 0) {
            return true;
        }
        return false;
    }

    /*10.Creati o metoda care sa se numeasca isEligibleToVote. Metoda sa primeasca ca si parametru un numar,
         care sa reprezinte varsta, iar metoda sa iti zica daca persoana are drept de vot.
         Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false.
         Apelati metoda in main() pentru a verifica daca functioneaza.*/

    public boolean isEligibleToVote(int y) {
        if (y >= 18) {
            return true;
        }
        return false;
    }

    /*11.Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
         Apelati metoda in main() pentru a verifica daca functioneaza.*/

    public int biggestNr(int q, int r, int t) {
        if (q >= r && q >= t)
            return q;
        if (r >= q && r >= t)
            return r;
        return t;
    }

    //***************************************<<_____L A B  12_____>>***************************************************

    //**************************************<<_____T E M A  1_____>>***************************************************

//1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
// Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.

    public void printTo100(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    //2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.

    public void printToMinus100(int n) {
        for (int i = n; i >= -100; i--) {
            System.out.println(i);
        }
    }

    //3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea

    public void printCountBetweenNumbers(int i, int j) {
        if (i < j) {
            for (int x = i; x <= j; x++) {
                System.out.println(x);
            }
        } else
            for (int x = i; x >= j; x--) {
                System.out.println(x);
            }
    }

    //4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.

    public void printCountToHighest(int i, int j) {
        if (i < j) {
            for (int x = i; x <= j; x++) {
                System.out.println(x);
            }
        } else
            for (int x = j; x <= i; x++) {
                System.out.println(x);
            }
    }

    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void printCountEvenNr() {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void printCountOddNr() {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }

    //7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, iar la final sa returneze rezultatul.

    public int SumTo100(int q) {
        int sum = 0;
        for (int i = q; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    //8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
    // si sa calculeze media numerelor. La final, metoda sa returneze media.

    public float SumTo100AndAverage(int q) {
        int sum = 0;
        float c = 0;

        for (int i = q; i <= 100; i++) {
            sum += i;
            c += 1;
        }

        return sum / c;
    }

    //9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:

    public void drawStars() {
        for (int row = 1; row <= 7; row++) {
            for (int star = 1; star <= 8 - row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //**************************************<<_____T E M A  2____>>***************************************************

    //1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numarul primit si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.

    public void printTo100While(int i) {
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

    public void printTo100DoWhile(int i) {
        if (i > 100)
            System.out.println("Introdu un numar pana la 100!");
        else
            do {
                System.out.println(i);
                i++;
            } while (i <= 100);
    }

    //2. Creati o metoda in clasa LogicalOp, care primeste un numar ca si parametru.
    // Metoda sa verifice numarul primit si sa afiseze in consola o numaratoare (inversa) pana la -100, pornind de la numarul primit ca si parametru.

    public void printToMinus100While(int i) {
        while (i >= -100) {
            System.out.println(i);
            i--;
        }
    }

    public void printToMinus100DoWhile(int i) {
        if (i < -100)
            System.out.println("Introdu un numar mai mare sau egal cu -100!");
        else
            do {
                System.out.println(i);
                i--;
            } while (i >= -100);
    }

    //3. Creati o metoda in clasa LogicalOp, care primeste doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea.

    public void printCountBetweenNumbersWhile(int i, int j) {
        if (i < j) {
            while (i <= j) {
                System.out.println(i);
                i++;
            }
        } else
            while (i >= j) {
                System.out.println(i);
                i--;
            }
    }

    public void printCountBetweenNumbersDoWhile(int i, int j) {
        if (i < j) {
            do {
                System.out.println(i);
                i++;
            } while (i <= j);
        } else
            do {
                System.out.println(i);
                i--;
            } while (i >= j);

    }

    //4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.

    public void printCountToHighestWhile(int i, int j) {
        if (i < j) {
            while (i <= j) {
                System.out.println(i);
                i++;
            }
        } else
            while (j <= i) {
                System.out.println(j);
                j++;
            }
    }

    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void printCountEvenNrWhile() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        }
    }

    public void printCountEvenNrDoWhile() {
        int i = 1;
        do {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        } while (i <= 100);

    }

    //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void printCountOddNrWhile() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 != 0)
                System.out.println(i);
            i++;
        }
    }

    //7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
    // Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
    // Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.

    public void intervalMeanWhile() {
        int sum = 0;
        int i = 111;
        float c = 0;
        while (i <= 8899) {
            sum += i;
            c++;
            i++;
        }
        System.out.println("Suma numerelor din intervalul 111-8899 este: " + sum);
        System.out.println("Media numerelor din intervalul 111-8899 este: " + sum / c);

    }

    //8. Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile cu 7, din acel interval.

    public float meanBy7(int a, int b) {
        int iMin;
        int iMax;

        if (a < b) {
            iMin = a;
            iMax = b;
        } else {
            iMin = b;
            iMax = a;
        }

        int count = 0;
        float sum = 0;

        while (iMin <= iMax) {
            if (iMin % 7 == 0) {
                count++;
                sum += iMin;
            }
            iMin++;
        }

        return sum / count;
    }

    //9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

    public void first20NrOfFibonacci() {
        int r = 0;
        int t = 1;
        int sum;
        int count = 2;

        System.out.print(r + "; ");
        System.out.print(t + "; ");

        while (count < 20) {
            sum = r + t;
            System.out.print(sum + "; ");
            count++;
            r = t;
            t = sum;
        }

    }

    //10. Creati o metoda numita CozaLozaWoza.

    public void cozaLozaWoza() {
        int i = 1;
        boolean flag;
        while (i <= 110) {

            flag = false;
            if (i % 3 == 0) {
                System.out.print("Coza");
                flag = true;
            }
            if (i % 5 == 0) {
                System.out.print("Loza");
                flag = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                flag = true;
            }

            if (flag == false)
                System.out.print(i);

            if (i % 11 == 0)
                System.out.println('\n');
            else
                System.out.print(" ");

            i++;
        }

    }

    public void tablaInmultirii() {
        int factor1 = 1;
        while (factor1 <= 10) {
            int factor2 = 1;
            while (factor2 <= 10) {
                System.out.print("\t" + factor1 * factor2);
                factor2++;
            }
            System.out.println();
            factor1++;
        }
    }


    //**************************************<<_____L A B 13____>>***************************************************


//    2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100.
//    Sa se afiseze progresul in consola pe tot parcursul.

    public int[] getArrayToHundred() {
        int[] myArray = new int[100];

        for (int i = 1; i <= 100; i++) {
            myArray[i - 1] = i;
        }
        return myArray;
    }

//    3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol,
//    si sa il returneze populat cu toate valorile pare de la 1 la 100.

    public int[] getEvenArrayToHundred(int[] evenArray) {
        int j = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenArray[j] = i;
                j++;
            }
        }
        return evenArray;
    }

//    4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
//    Metoda sa calculeze si sa returneze media numerelor din array.

    public float getAverageArray(int[] myArray) {
        float sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        return (sum / myArray.length);
    }

//    5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru de tip String.
//    Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.

    public boolean checkInArray(String[] arrString, String input) {
        boolean flag = false;

        for (int i = 0; i < arrString.length; i++) {
            if (arrString[i].equals(input)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

//    6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
//    Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa returneze pozitia pe care se afla numarul.

    public int getPositionInArray(int[] Numbers, int nr) {
        int position = 0;
        boolean flag = false;

        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] == nr) {
                position = i;
                flag = true;
            }
        }
        if (flag)
            return position;
        else
            return -1;
    }

//    7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:

    public void drawLines() {
        char[] line = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-',};

        for (int i = 0; i <= 10; i++) {
            System.out.println(line);
        }
    }

//    8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
//    Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar.

    public int[] removeNrFromArray(int[] myArray, int nr) {
        int[] secondArray = new int[myArray.length];
        int j = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == nr)
                continue;
            secondArray[j++] = myArray[i];
        }
        int[] finArray = new int[j];

        for (int i = 0; i < j; i++)
            finArray[i] = secondArray[i];
        return finArray;
    }

//    9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.

    public int getSecondSmallestNrInArray(int[] myArray) {
//        int iMin = 2147483647; // myArray[0];
//        int iMin2 = 2147483647; // myArray[0];
        int arrLen = myArray.length;
//
//        for (int i = 0; i < arrLen; i++)
//            if (myArray[i] < iMin2)
//                if (myArray[i] < iMin) {
//                    iMin2 = iMin;
//                    iMin = myArray[i];
//                } else {
//                    iMin2 = myArray[i];
//    }
        int iMin = myArray[0];
        int i;
        for (i = 0; i < arrLen; i++) {
            if (myArray[i] < iMin)
                iMin = myArray[i];
        }

        int iMin2 = 2147483647;

        for (i = 0; i < arrLen; i++) {
            if (myArray[i] < iMin2 && myArray[i] != iMin)
                iMin2 = myArray[i];
        }

        return iMin2;
    }

//    10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
//    Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.

    public int[] copyArray(int[] firstArray, int[] emptyArray) {

        for (int i = 0, j = 0; i < firstArray.length; i++) {
            emptyArray[j] = firstArray[i];
            j++;
        }
        return emptyArray;
    }

    /*********************************** O P T I O N A L E ***********************************************/


//     2. Creati o metoda care sa insereze un element pe o pozitie specifica intr-un array.
    public int[] insertElement(int[] myArray, int index, int nr) {
        int[] newArray = new int[myArray.length + 1];

        for (int i = 0; i < index - 1; i++) {
            newArray[i] = myArray[i];
        }
        newArray[index - 1] = nr;
        for (int i = index; i <= myArray.length; i++) {
            newArray[i] = myArray[i - 1];
        }
        return newArray;
    }


//     3. Creati o metoda care sa gaseasca cel mai mare si cel mai mic numar dintr-un array.

    public void getMinMaxFromArray(int[] anArray) {
        int iMin = anArray[0];
        int iMax = anArray[0];

        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] < iMin)
                iMin = anArray[i];
            else if (anArray[i] > iMax)
                iMax = anArray[i];
        }
        System.out.println("Cel mai mic numar din array este: " + iMin);
        System.out.println("Cel mai mare numar din array este: " + iMax);

    }

//     4. Creati o metoda care sa inverseze valorile unui array de int-uri.

    public int[] invertArray(int[] myArray) {
        int lenArr = myArray.length;
        int[] secondArray = new int[lenArr];
        int i, j = 0;

        for (i = lenArr - 1; i >= 0; i--) {
            secondArray[j++] = myArray[i];
        }
        return secondArray;
    }

//     5. Creati o metoda care sa gaseasca toate valorile duplicate dintr-un array.

    public int[] findDuplicate(int[] myArray) {
        int i, j, k = 0;
        int lenArr = myArray.length;
        int[] tempArray = new int[lenArr / 2];

        for (i = 0; i < lenArr - 1; i++) {
            for (j = i + 1; j < lenArr; j++) {
                if (myArray[i] == myArray[j])
                    tempArray[k++] = myArray[i];
            }
        }
        int[] duplicateValues = new int[k];
        for (j = 0; j < k; j++) {
            duplicateValues[j] = tempArray[j];
        }
        return duplicateValues;
    }


//     6. Creati o metoda care sa gaseasca toate elementele comune intre doua array-uri (array de String).

    public String[] findSameElements(String[] firstStr, String[] secondStr) {
        int k = 0;
        int minLen;
        if (firstStr.length > secondStr.length)
            minLen = secondStr.length;
        else
            minLen = firstStr.length;

        String[] tempArray = new String[minLen];
        for (int i = 0; i < firstStr.length; i++) {
            for (int j = 0; j < secondStr.length; j++) {
                if (firstStr[i].equals(secondStr[j]))
                    tempArray[k++] = firstStr[i];
            }
        }
        String[] finalArray = new String[k];
        for (int i = 0; i < k; i++) {
            finalArray[i] = tempArray[i];
        }
        return finalArray;
    }


//     7. Creati o metoda care sa primeasca un array de numere ne-ordonat, si sa il returneze ordonat crescator.

    public int[] sortUpArray(int[] randArr) {
        int i, j;
        int[] finalArr = new int[randArr.length];

        for (i = 0; i < randArr.length - 1; i++) {
            for (j = i + 1; j < randArr.length; j++) {
                if (randArr[i] > randArr[j]) {
                    int tempVal = randArr[i];
                    randArr[i] = randArr[j];
                    randArr[j] = tempVal;
                }
            }
        }

        for (i = 0; i < randArr.length; i++) {
            finalArr[i] = randArr[i];
        }
        return finalArr;
    }


}





