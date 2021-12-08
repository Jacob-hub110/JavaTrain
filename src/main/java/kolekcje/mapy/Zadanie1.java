package kolekcje.mapy;

import java.util.HashMap;
import java.util.Map;

/**
 * W metodzie main stworz mape Long, String, gdzie klucz bedzie reprezentowal id a wartosc imie.
 * Dodaj rekordy do mapy, tak aby kilka imion zaczynalo sie na literka A.
 * Korzystajac z mapy wyswietl wszystkie imiona zaczynajace sie na literka A.
 * Upewnij sie ze w mapie jest kilka rekordow z imieniem Jan.
 * Korzystajac z mapy, wyswietl wszystkie id, ktore przechowuja wartosc Jan.
 */
public class Zadanie1 {
    public static void main(String[] args) {
        Map<Long, String> map = new HashMap<>();
        map.put(1L, "Ania");
        map.put(2L, "Andrzej");
        map.put(3L, "Lukasz");
        map.put(4L, "Mateo");
        map.put(5L, "Amadea");
        map.put(6L, "Aneta");
        map.put(7L, "Kasia");
        map.put(8L, "Jan");
        map.put(9L, "Jan");

        for (Map.Entry<Long, String> entry : map.entrySet()) {
            String value = entry.getValue();
            char[] chars = value.toCharArray();
            if (chars[0] == 'A') {
                System.out.println(value);
            }

            if (value.equals("Jan")) {
                System.out.println(entry.getKey());
            }
        }
    }
}
