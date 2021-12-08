package rekurencja;

public class Main {

    public static void main(String[] args) {

        long start = System.nanoTime();

        OperacjeMatematyczne.fib(40);

        long end = System.nanoTime();

        System.out.println("Iteracja " + (end - start));

        start = System.nanoTime();

        OperacjeMatematyczne.fibRecursive(40);

        end = System.nanoTime();

        System.out.println("Rekurencja " + (end - start));

        System.out.println();
        System.out.println("Metoda iteracyjna liczaca sume kwadratow: " + OperacjeMatematyczne.calculateSquareSumIteracja(5));
        System.out.println("Metoda rekursyjna liczaca sume kwadratow: " + OperacjeMatematyczne.calculateSquareSumRecursive(5));


    }
}
