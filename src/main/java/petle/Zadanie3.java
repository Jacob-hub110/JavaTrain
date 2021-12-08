package petle;

import java.util.Scanner;

/**
 * Napisz program, ktory wyswietla podany przez uzytkownika napis, az ten nie wpisze end.
 */
public class Zadanie3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while ( !input.equals("end") ) {
            input = scanner.next();
            System.out.println(input);
        }
    }
}

// jeżeli wiem ile razy sie obruce to for a jesli nie to while !!!
