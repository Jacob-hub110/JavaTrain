package wyjatki.zadanie1;

import java.util.Scanner;

/**
 *
 * 1. Stworz klase User (login, password, firstname, email, creationDate)
 * 2. User powinien miec prywatny konstruktor.
 * 3. Stworz metode public static User create(...) w klasie User, ktora
 *  - rzuci odpowiedni wyjatek jesli dowolny z przekazanych do niej parametrow bedzie nullem
 *  - rzuci wyjatek IllegalArgumentException z odpowiednia trescia jesli login bedzie krotszy niz 6 znakow
 *  - ustawi creationDate na aktualna date
 *
 *
 *  4. W main za pomoca skanera pobierz informacje od uzytkownika na podstawie ktorych zostanie stworzony obiekt User.
 *  5. Wyswietl stworzonego uzytkownika lub informacje o niepowodzeniu
 *  6. Zawsze, niezaleznie od wyniku poinformuj o zakonczeniu programu.
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("login");
        String login = scanner.next();
        System.out.println("hasło");
        String password = scanner.next();
        System.out.println("imię");
        String firstname = scanner.next();
        System.out.println("email");
        String email = scanner.next();


        try {
            User user = User.create(login, password, firstname, email);
            System.out.println(user);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("end");
        }

    }
}
