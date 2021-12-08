package tablice;

public class Zad1 {

    /**
     * 1. Stworz tablice typu String o wielkosci 5.
     * 2. Uzupelnij tablice dowolnymi wartosciami.
     * 3. Wyswietl wszystkie elementy za pomoca petli fori.
     * <p>
     * 4. Wyswietl wszystkie elementy za pomoca petli foreach.
     */

    public static void main(String[] args) {
        String[] names = new String[5];

        names[0] = "kasia";
        names[1] = "asia";
        names[2] = "stasia";
        names[3] = "basia";
        names[4] = "ola";

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

        System.out.println();

        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
