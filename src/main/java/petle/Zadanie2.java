package petle;

/**
 * Za pomocą petli zrealizuj rysunki z pliku figures.png.
 * Najlepiej jedna figura = jedna metoda
 */
public class Zadanie2 {
    public static void main(String[] args) {
        int size = 10;
        String brejk = "--------------------";
        printSquare(size);
        System.out.println(brejk);
        printTriangle(size);
        System.out.println(brejk);
        printSlash(size);
        System.out.println(brejk);
        printSquareWithoutFilling(size);
        System.out.println(brejk);
        printX(size);
    }

    private static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printTriangle(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printSlash(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    private static void printSquareWithoutFilling(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1) {
                    System.out.print("* ");
                } else if (j == 0 || j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void printX(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    System.out.print("* ");
                } else if (j == size - 1 - i ) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


/**
 * if (i == j) {
 * System.out.print("* ");
 * } else if (i == 0 && j == 5) {
 * System.out.print("* ");
 * } else if (i == 1 && j == 4) {
 * System.out.print("* ");
 * } else if (i == 2 && j == 3) {
 * System.out.print("* ");
 * } else if (i == 3 && j == 2) {
 * System.out.print("* ");
 * } else if (i == 4 && j == 1) {
 * System.out.print("* ");
 * } else if (i == 5 && j == 0) {
 * System.out.print("* ");
 * } else {
 * System.out.print(" ");
 * }
 */