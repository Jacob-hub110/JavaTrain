package instrukcjewarunkowe;

public class Zadanie1 {

    /*
        Wejście: Trzy liczby całkowite

        Wyjście: Trzy liczby całkowite w kolejności od największej do najmniejszej

        Zastrzezenie: Mozna korzystac tylko z if/else/elseif.

        Np. wejscie: 5 11 3
            wyjscie: 11 5 3

        Wyswietlanie musi sie odbywac naraz. Czyli np: System.out.println(a + " " + b + " " + c);
     */
    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        int c = 0;

        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b >= c) {
            if (a >= c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else {
            if (a >= b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }

    }

}
