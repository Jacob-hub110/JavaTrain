package instrukcjewarunkowe.switchexample;

import java.util.Scanner;

public class Zadanie1 {

    /*
        Zapytaj uzytkownika o liczbe z przedzialu 1-5 po niemiecku, francusku lub wegiersku.
        Program powinien wyswietlic polska nazwe tej liczby.
        Skorzystaj ze switcha.
        Jesli uzytkownik poda niepoprawna liczbe, program powinien wyswietlic odpowiednia informacje.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe z przedzialu 1-5 po niemiecku, francusku lub wegiersku: ");

        String number = scanner.next();
        // number to 5 różnych liczb
        switch (number) {
            case "eins":
            case "une":
            case "egy":
                System.out.println("jeden");
                break;

            case "zwei":
            case "deux":
            case "kettő":
                System.out.println("dwa");
                break;

            case "drei":
            case "trois":
            case "három":
                System.out.println("trzy");
                break;

            case "vier":
            case "quatre":
            case "négy":
                System.out.println("cztery");
                break;

            case "fünf":
            case "cinq":
            case "süt":
                System.out.println("pięć");
                break;

            default:
                System.out.println("Podano nieprawidłową liczbę");
        }














    }

}
