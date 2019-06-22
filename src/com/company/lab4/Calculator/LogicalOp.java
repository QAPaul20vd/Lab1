package com.company.lab4.Calculator;

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
}



