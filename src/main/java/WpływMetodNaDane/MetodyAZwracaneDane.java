package WpływMetodNaDane;

public class MetodyAZwracaneDane {

    public static void main(String[] args) {
        // tworze tablice array
        int[] array = { 5 };
        // korzystam z metody test na tablicy array
        test(array);
        System.out.println(array[0]);

        // tworze zmienną number
        int number = 20;
        // nadpisuje zmienną number; zamiast '20' znajduje się w niej teraz wynik metody test na liczbie 20
        number = test(number);

        System.out.println(number);
    }

    public static void test(int[] array) {
        //Zmiana na obiekcie bedzie widoczna w oryginalnej tablicy przekazenj do metody
        array[0] = 3;
    }

    public static int test(int number) {
        //number to kopia wartosci zmiennej przekaznej do metody
        //jesli nie nadpiszemy oryginalu wynikiem stan zmiennej ktora zostala tutaj przekazana sie nie zmieni
        number = 10;
        return number;
    }
}
