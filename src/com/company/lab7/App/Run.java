package com.company.lab7.App;


public class Run {

    private Read read = new Read();
    private Calculator calc = new Calculator();
    private LogicalOp logic = new LogicalOp();

    /**
     * Continua sa afiseze meniul cat timp este selectata o optiune
     */
    public void runTheProgram() {
        do {
            printMenu();

        } while (selectItem());
    }

    /**
     * Afiseaza meniul
     **/
    private void printMenu() {
        System.out.println("\n0. Quit program.\n" +
                "1. Basic Operations\n" +
                "2. Logical operations\n" +
                "3. Drawings\n");

    }

    /**
     * Selecteaza o optiune din meniu
     */
    private boolean selectItem() {
        System.out.print("\nPlease select one menu number: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                System.out.println("\nBasic operations are:");
                runBasicOperationsMenu();
                return true;

            case 2:
                System.out.println("\nLogical operations are:");
                runLogicalOpMenu();
                return true;
            case 3:
                System.out.println("\nChoose what to draw:");
                runDrawingsMenu();
                return true;

            case 0:
                System.out.println("Bye!");
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }
    }


    /**
     * Continua sa afiseze meniul cat timp este selectata o optiune
     */
    private void runBasicOperationsMenu() {
        do {
            printBasicOpMenu();

        } while (selectItemFromBasicOpMenu());
    }

    /**
     * Afiseaza meniul
     **/
    private void printBasicOpMenu() {
        System.out.println("\n0. Return to main menu.\n" +
                "1. Sum\n" +
                "2. Difference\n" +
                "3. Multiply\n" +
                "4. Division\n" +
                "5. Modulo\n");

    }

    /**
     * Selecteaza o optiune din meniu
     */
    private boolean selectItemFromBasicOpMenu() {
        System.out.print("\nPlease select one menu number: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                sum();
                return true;
            case 2:
                dif();
                return true;
            case 3:
                mult();
                return true;
            case 4:
                div();
                return true;
            case 5:
                modulo();
                return true;


            case 0:
                System.out.println("Return to main menu.");
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }
    }

    /**
     * Afiseaza meniul pentru Logical Operations cat timp este selectata o optiune
     */
    private void runLogicalOpMenu() {
        do {
            printLogicalMenu();

        } while (selectItemMenu());
    }

    private void printLogicalMenu() {
        System.out.println("\n0. Return to main menu\n" +
                "1. Operations with IF\n" +
                "2. Operations with FOR\n" +
                "3. Operations with WHILE\n" +
                "4. Operations with ARRAY\n" +
                "5. Operations with LIST\n");
    }

    private boolean selectItemMenu() {
        System.out.print("\rSelect the logical operation: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                runLogicalOpIFMenu();
                return true;
            case 2:
                runLogicalOpFORMenu();
                return true;
            case 3:
                runLogicalOpWHILEMenu();
                return true;
//            case 4:
//                compareTextAndString();
//                return true;
//            case 5:
//                amountOfSnow();
//                return true;

            case 0:
                System.out.println("Return to main menu.");
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }
    }


    /**
     * Afiseaza meniul pentru Logical Operations pentru IF cat timp este selectata o optiune
     */
    private void runLogicalOpIFMenu() {
        do {
            printLogicalIfMenu();

        } while (selectItemIfMenu());
    }

    /**
     * Meniul Logical Operations IF
     */
    private void printLogicalIfMenu() {
        System.out.println("\n0. Return to Logical Operations menu.\n" +
                "1. Find bigger number between 2 numbers\n" +
                "2. Find bigger number between 3 numbers\n" +
                "3. Compare string\n" +
                "4. Compare text and string\n" +
                "5. Amount of snow\n" +
                "6. Compare numbers\n" +
                "7. Check if the number is odd or even\n" +
                "8. Check if the person can vote\n");
    }

    /**
     * Selecteaza o optiune din meniul Logical Operations IF
     */
    private boolean selectItemIfMenu() {
        System.out.print("\rSelect the logical operation: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                checkBiggerNr();
                return true;
            case 2:
                checkBigger3Nr();
                return true;
            case 3:
                compareString();
                return true;
            case 4:
                compareTextAndString();
                return true;
            case 5:
                amountOfSnow();
                return true;
            case 6:
                compareNrTo3();
                return true;
            case 7:
                checkIfNumberIsEven();
                return true;
            case 8:
                checkIfSomeCanVote();
                return true;

            case 0:
                System.out.println("Return to Logical Operations menu.");
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }
    }

    /**
     * Citeste primul numar
     */
    private int getFirstNr() {
        System.out.print("Please enter one number: ");
        int first = read.getInt();
        return first;
    }

    /**
     * Citeste al doilea numar
     */
    private int getSecondNr() {
        System.out.print("Please enter the second number: ");
        int second = read.getInt();
        return second;
    }

    /**
     * Apeleaza metoda de adunare
     */
    private void sum() {
        System.out.println("The sum is: " +
                calc.addNrs(getFirstNr(), getSecondNr()));
    }

    /**
     * Apeleaza metoda de scadere
     */
    private void dif() {
        System.out.println("The difference is: " +
                calc.difNrs(getFirstNr(), getSecondNr()));
    }

    /**
     * Apeleaza metoda de inmultire
     */
    private void mult() {
        System.out.println("The result of the multiplication is: " +
                calc.multNrs(getFirstNr(), getSecondNr()));
    }

    /**
     * Apeleaza metoda de impartire
     */
    private void div() {
        System.out.println("The result of the division is: " +
                calc.divNrs(getFirstNr(), getSecondNr()));
    }

    /**
     * Apeleaza metoda modulo
     */
    private void modulo() {
        System.out.println("The rest of the division is: " +
                calc.modulo(getFirstNr(), getSecondNr()));
    }

    /**
     * Metoda pentru a afla numarul mai mare
     */
    private void checkBiggerNr() {
        System.out.println("The bigger number is: " +
                logic.checkBiggerNumber(getFirstNr(), getSecondNr()));
    }

    private void checkBigger3Nr() {
        System.out.println("Introdu trei numere:");
        int a = getFirstNr();
        int b = getSecondNr();
        System.out.print("Please enter the third number: ");
        int c = read.getInt();
        System.out.println("Cel mai mare numar este: " + logic.biggestNr(a, b, c));
    }

    /**
     * Citeste un string
     */
    private String getStr() {
        System.out.print("Introdu textul: ");
        String text = read.getString();
        return text;
    }

    private void compareString() {
        System.out.println(logic.compareText(getStr()));
    }

    private void compareTextAndString() {
        System.out.println(logic.compTextAndNr(getStr(), getFirstNr()));
    }

    private void amountOfSnow() {
        System.out.println(logic.snow(getFirstNr()));
    }

    private void compareNrTo3() {
        System.out.println(logic.compareNr(getFirstNr()));
    }

    private void checkIfNumberIsEven() {
        if (logic.isNumberEven(getFirstNr())) {
            System.out.println("Numarul introdus este par.");
        } else {
            System.out.println("Numarul introdus este impar.");
        }
    }

    private void checkIfSomeCanVote() {
        System.out.print("Introdu varsta persoanei: ");
        int x = read.getInt();
        if (logic.isEligibleToVote(x)) {
            System.out.println("Persoana poate vota.");
        } else {
            System.out.println("Persoana nu are drept de vot.");
        }
    }

    /**
     * Afiseaza meniul pentru Logical Operations pentru FOR cat timp este selectata o optiune
     */
    private void runLogicalOpFORMenu() {
        do {
            printLogicalFORMenu();

        } while (selectItemFORMenu());
    }

    /**
     * Meniul Logical Operations FOR
     */
    private void printLogicalFORMenu() {
        System.out.println("\n0. Return to Logical Operations menu.\n" +
                "1. Print to 100 from a given number\n" +
                "2. Print to -100 from a given number\n" +
                "3. Print count between 2 given numbers\n" +
                "4. Print ascending count between 2 given numbers\n" +
                "5. Print even numbers from 1 to 100\n" +
                "6. Print odd numbers from 1 to 100\n" +
                "7. Sum of numbers between a given numbers and 100\n" +
                "8. Mean of numbers between a given numbers and 100\n");
    }

    /**
     * Selecteaza o optiune din meniul Logical Operations FOR
     */
    private boolean selectItemFORMenu() {
        System.out.print("\rSelect the logical operation: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                printTo100FromNr();
                return true;
            case 2:
                printToMinus100FromNr();
                return true;
            case 3:
                printCountBetweenNr();
                return true;
            case 4:
                printCountToHighest();
                return true;
            case 5:
                printEvenNrsTo100();
                return true;
            case 6:
                printOddNrsTo100();
                return true;
            case 7:
                sumTo100();
                return true;
            case 8:
                meanTo100();

                return true;

            case 0:
                System.out.println("Return to Logical Operations menu.");
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }
    }

    private void printTo100FromNr() {
        logic.printTo100(getFirstNr());
    }

    private void printToMinus100FromNr() {
        logic.printToMinus100(getFirstNr());
    }

    private void printCountBetweenNr() {
        logic.printCountBetweenNumbers(getFirstNr(), getSecondNr());
    }

    private void printCountToHighest() {
        logic.printCountToHighest(getFirstNr(), getSecondNr());
    }

    private void printEvenNrsTo100() {
        logic.printCountEvenNr();
    }

    private void printOddNrsTo100() {
        logic.printCountOddNr();
    }

    private void sumTo100() {
        int x = getFirstNr();
        System.out.print("Suma numerelor pornind de la numarul " + x + " pana la 100 este: " +
                logic.sumTo100(x) + ".");
    }

    private void meanTo100() {
        int x = getFirstNr();
        System.out.print("Media numerelor pornind de la numarul " + x + " pana la 100 este: " +
                logic.sumTo100AndAverage(x) + ".");
    }

    /**
     * Afiseaza meniul pentru Logical Operations pentru WHILE cat timp este selectata o optiune
     */
    private void runLogicalOpWHILEMenu() {
        do {
            printLogicalWHILEMenu();

        } while (selectItemWHILEMenu());
    }

    /**
     * Meniul Logical Operations WHILE
     */
    private void printLogicalWHILEMenu() {
        System.out.println("\n0. Return to Logical Operations menu.\n" +
                "1. Print to 100 from a given number\n" +
                "2. Print to -100 from a given number\n" +
                "3. Print count between 2 given numbers\n" +
                "4. Print ascending count between 2 given numbers\n" +
                "5. Print even numbers from 1 to 100\n" +
                "6. Print odd numbers from 1 to 100\n" +
                "7. Print the mean of numbers divisible with 7 in an interval\n" +
                "8. Mean of numbers between a given numbers and 100\n" +
                "9. Print first X numbers from Fibonacci Sequence\n" +
                "10. Metod CozaLozaWoza\n" +
                "11. Multiplication Table");
    }

    /**
     * Selecteaza o optiune din meniul Logical Operations WHILE
     */
    private boolean selectItemWHILEMenu() {
        System.out.print("\rSelect the logical operation: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                printWhileTo100FromNr();
                return true;
            case 2:
                printWhileToMinus100FromNr();
                return true;
            case 3:
                printWhileCountBetweenNr();
                return true;
            case 4:
                printWhileCountToHighest();
                return true;
            case 5:
                printWhileEvenNrsTo100();
                return true;
            case 6:
                printWhileOddNrsTo100();
                return true;
            case 7:
                meanBySeven();
                return true;
            case 8:
                meanTo100();
                return true;
            case 9:
                Fibonacci();
                return true;
            case 10:
                CozaLozaWoza();
                return true;
            case 11:
                multiplicationTable();
                return true;

            case 0:
                System.out.println("Return to Logical Operations menu.");
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }
    }

    private void printWhileTo100FromNr() {
        logic.printTo100While(getFirstNr());
    }

    private void printWhileToMinus100FromNr() {
        logic.printToMinus100While(getFirstNr());
    }

    private void printWhileCountBetweenNr() {
        logic.printCountBetweenNumbersWhile(getFirstNr(), getSecondNr());
    }

    private void printWhileCountToHighest() {
        logic.printCountToHighestWhile(getFirstNr(), getSecondNr());
    }

    private void printWhileEvenNrsTo100() {
        logic.printCountEvenNrWhile();
    }

    private void printWhileOddNrsTo100() {
        logic.printCountOddNrWhile();
    }

    private void meanBySeven() {
        int x = getFirstNr();
        int y = getSecondNr();
        System.out.println("Media numerelor divizibile cu 7 din intervalul " + x + " - " + y +
                " este: " + logic.meanBy7(x, y));
    }

    private void Fibonacci() {
        int x = getFirstNr();
        System.out.println("Primele " + x + " numere din sirul lui Fibonacci sunt: ");
        logic.first20NrOfFibonacci(x);
    }

    private void CozaLozaWoza() {
        logic.cozaLozaWoza();
    }

    private void multiplicationTable() {
        logic.tablaInmultirii();
    }

    /**
     * Continua sa afiseze meniul cat timp este selectata o optiune
     */
    private void runDrawingsMenu() {
        do {
            printDrawingsMenu();

        } while (selectItemFromDrawingsMenu());
    }

    /**
     * Afiseaza meniul
     **/
    private void printDrawingsMenu() {
        System.out.println("\n0. Return to main menu.\n" +
                "1. Draw Stars\n" +
                "2. Draw Lines\n" +
                "3. Draw a Face\n" +
                "4. Draw JAVA\n");

    }

    /**
     * Selecteaza o optiune din meniu
     */
    private boolean selectItemFromDrawingsMenu() {
        System.out.print("\nPlease select one menu number: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                drawStars();
                return true;
            case 2:
                drawLines();
                return true;
            case 3:
                drawFace();
                return true;
            case 4:
                drawJava();
                return true;


            case 0:
                System.out.println("Return to main menu.");
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }
    }

    private void drawStars() {
        logic.drawStars();
    }

    private void drawLines() {
        logic.drawLines();
    }

    private void drawFace() {
        logic.drawFace();
    }

    private void drawJava() {
        logic.drawJava();
    }


}

