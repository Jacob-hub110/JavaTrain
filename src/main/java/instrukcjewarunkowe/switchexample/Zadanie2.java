package instrukcjewarunkowe.switchexample;

import java.util.Scanner;

public class Zadanie2 {

    /*
        Zapytaj uzytkownika o liczbe netto do zaplaty za fakture oraz o kod kraju w ktorym bedzie rozliczana.
        1. PL - 23%
        2. DE - 20%
        3. FR - 25%
        ...
        Mozesz dopisac wiecej krajow.
        Wyswietl kwote brutto.
        Uzyj switcha.
        Wyswietanie wyniku tylko na koncu programu poza switchem.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("netto: ");
        double netto = scanner.nextDouble();
        System.out.println("Country(PL/DE/FR): ");
        String countryCode = scanner.next();
        double brutto = 0;

        switch (countryCode){
            case "PL":
                brutto = 23 * netto / 100;
                brutto += netto;
                break;
            case "DE":
                brutto = 20 * netto / 100;
                brutto += netto;
                break;
            case "FR":
                brutto = 25 * netto / 100;
                brutto += netto;
                break;
            default:
                System.out.println("Lack of Country code; Can't calculate amount of money brutto");
        }

        System.out.println("Amount of money brutto: " + brutto);
    }

}


