package petle;

/**
 * Za pomocą pętli for wyświetl:
 * a) wyświetl liczby od 0 do 9
 * b) wyświetl liczby parzyste od 0 do 30 włącznie
 * c) wyświetl liczby podzielne przez 3
 * d) wyświetl liczby od 40 do 30 malejąco
 */
public class Zadanie1 {

    public static void main(String[] args) {
        printA();
        printB();
        printC();
        printD();
    }

    private static void printA() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printB() {
        for (int i = 0; i < 31; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    private static void printC() {
        for (int i = 0; i < 30; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void printD() {
        for (int i = 40; i > 29; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
