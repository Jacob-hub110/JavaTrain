package skaner;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        //Stworzenie obiektu skanera
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj napis:");

        //Program sie zatrzymuje, az nie wpiszesz czegos na konsoli.
        String word = scanner.next();

        System.out.println("Podales: " + word);

        System.out.println("Podaj liczba:");

        //Program sie zatrzymuje, az nie wpiszesz czegos na konsoli.
        int number = scanner.nextInt();

        System.out.println("Podales: " + number);

    }

}
