package fizzbuzz;

public class FizzBuzz {

    // 1. Wyswietl liczby od 1 do 100.
    // 2. Jesli liczba jest podzielna przez 3, to zamiast niej wyswietl Fizz
    // 3. Jesli liczba jest podzielna przez 5, to zamiast niej wyswietl Buzz
    // 4. Jesli liczba jest podzielna przez 3 i 5 to zamiast niej wyswietl FizzBuzz.
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
