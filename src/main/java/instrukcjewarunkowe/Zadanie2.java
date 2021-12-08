package instrukcjewarunkowe;

public class Zadanie2 {

    /*
        Wejście: Cztery liczby całkowite

        Wyjście: Cztery liczby całkowite w kolejności od największej do najmniejszej

        Zastrzezenie: Mozna korzystac tylko z if/else/elseif.

        Np. wejscie: 5 11 3 2
            wyjscie: 11 5 3 2

        Wyswietlanie musi sie odbywac naraz. Czyli np: System.out.println(a + " " + b + " " + c + " " + d);
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 11;
        int c = 3;
        int d = 2;


        if (a >= b && a >= c && a >= d) {
            if (b >= c && b >= d) {
                if (c >= d) {
                    System.out.println(a + " " + b + " " + c + " " + d);
                }
                if (c <= d) {
                    System.out.println(a + " " + b + " " + d + " " + c);
                }
            } else if (c >= b && c >= d) {
                if (b >= d) {
                    System.out.println(a + " " + c + " " + b + " " + d);
                }
                if (b <= d) {
                    System.out.println(a + " " + c + " " + d + " " + b);
                }
            } else {
                if (c >= b) {
                    System.out.println(a + " " + d + " " + c + " " + b);
                }
                if (c <= b) {
                    System.out.println(a + " " + d + " " + b + " " + c);
                }
            }
        } else if (b >= a && b >= c && b >= d) {
            if (a >= c && a >= d) {
                if (c >= d) {
                    System.out.println(b + " " + a + " " + c + " " + d);
                }
                if (c <= d) {
                    System.out.println(b + " " + a + " " + d + " " + c);
                }
            } else if (c >= a && c >= d) {
                if (a >= d) {
                    System.out.println(b + " " + c + " " + a + " " + d);
                }
                if (a <= d) {
                    System.out.println(b + " " + c + " " + d + " " + a);
                }
            } else {
                if (c >= a) {
                    System.out.println(b + " " + d + " " + c + " " + a);
                }
                if (c <= a) {
                    System.out.println(b + " " + d + " " + a + " " + c);
                }
            }
        } else if (c >= a && c >= b && c >= d) {
            if (a >= b && a >= d) {
                if (b >= d) {
                    System.out.println(c + " " + a + " " + b + " " + d);
                }
                if (b <= d) {
                    System.out.println(c + " " + a + " " + d + " " + b);
                }
            } else if (b >= a && b >= d) {
                if (a >= d) {
                    System.out.println(c + " " + b + " " + a + " " + d);
                }
                if (a <= d) {
                    System.out.println(c + " " + b + " " + d + " " + a);
                }
            } else {
                if (a >= b) {
                    System.out.println(c + " " + d + " " + a + " " + b);
                }
                if (a <= b) {
                    System.out.println(c + " " + d + " " + b + " " + a);
                }
            }
        } else {
            if (a >= b && a >= d) {
                if (b >= c) {
                    System.out.println(d + " " + a + " " + b + " " + c);
                }
                if (b <= c) {
                    System.out.println(d + " " + a + " " + c + " " + b);
                }
            } else if (b >= a && b >= c) {
                if (a >= c) {
                    System.out.println(d + " " + b + " " + a + " " + c);
                }
                if (a <= c) {
                    System.out.println(d + " " + b + " " + c + " " + a);
                }
            } else {
                if (a >= b) {
                    System.out.println(d + " " + c + " " + a + " " + b);
                }
                if (a <= b) {
                    System.out.println(d + " " + c + " " + b + " " + a);
                }
            }
        }


    }

}
