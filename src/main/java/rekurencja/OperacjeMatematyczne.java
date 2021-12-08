package rekurencja;

public class OperacjeMatematyczne {

    //Np dla. 5 metoda ma zwrocic wynik 1+2+3+4+5
    public static int calculateSum(int n) {
        int output = 0;
        for (int i = 1; i <= n; i++) {
            output += i;
        }
        return output;
    }

    public static int calculateSumRecursive(int n) {
        if (n == 1) {
            return 1;
        }

        return n + calculateSumRecursive(n - 1);
    }

    //Np dla. 5! metoda ma zwrocic wynik [1*2*3*4*5] => to jest silnia
    public static int factorialIteracyjnie(int n) {
        int output = 1;
        for (int i = 1; i <= n; i++) {
            output *= i;
        }
        return output;
    }

    public static int factorialIteracyjnieRecursive(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorialIteracyjnieRecursive(n - 1);
    }


    // Metoda liczby n-ty wyraz ciagu fibonacciego
    public static long fib(long n) {
        if (n < 2) {
            return n;
        }

        long first = 1;
        long second = 1;

        for (int i = 2; i <= n; i++) {
            long temp = first + second;
            first = second;
            second = temp;
        }

        return first;
    }

    public static long fibRecursive(long n) {
        if (n <= 1) {
            return n;
        }

        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }


    public static int calculateSquareSumIteracja(int n) {
        int output = 0;
        for (int i = 1; i <= n; i++) {
            output += i * i;
        }
        return output;
    }

    public static int calculateSquareSumRecursive(int n) {
        if (n == 1) {
            return 1;
        }

        return n * n + calculateSquareSumRecursive(n -1);
    }
}

