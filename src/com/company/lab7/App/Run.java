package com.company.lab7.App;


public class Run {

    private Read read = new Read();
    private Calculator calc = new Calculator();
    private LogicalOp logic = new LogicalOp();

    /**
     * Continua sa afiseze meniul cat timp este selectata o optiune
     */
    public void runProgram() {
        do {
            printMainMenu();

        } while (selectItemFromMenu());
    }

    /**
     * Afiseaza meniul
     **/
    private void printMainMenu() {
        System.out.println("\n0. Exit\n" +
                "1. Sum\n" +
                "2. Difference\n" +
                "3. Multiply\n" +
                "4. Division\n" +
                "5. Modulo\n" +
                "6. Logical operations");

    }

    /**
     * Selecteaza o optiune din meniu
     */
    private boolean selectItemFromMenu() {
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
            case 6:
                System.out.println("\nLogical operations are:");
                runLogicalOpMenu();
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
     * Afiseaza meniul pentru Logical Operations cat timp este selectata o optiune
     */
    public void runLogicalOpMenu() {
        do {
            printLogicalMenu();

        } while (selectItemForLogicalOp());
    }

    /**
     * Meniul Logical Operations
     */
    private void printLogicalMenu() {
        System.out.println("0. Return to main menu\n" +
                "1. Find bigger number\n"+
                "2. Compare string\n");
    }

    /**
     * Selecteaza o optiune din meniul Logical Operations
     */
    private boolean selectItemForLogicalOp() {
        System.out.print("\rSelect the logical operation: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                checkBiggerNr();
                return true;
            case 2:
                compareString();
                return true;

            case 0:
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
        System.out.print("Please enter the first number: ");
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
}

