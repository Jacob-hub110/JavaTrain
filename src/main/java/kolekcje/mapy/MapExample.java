package kolekcje.mapy;

import java.util.HashMap;
import java.util.Map;

/**
 * Mapy przechowują rekordy czyli pary klucz - wartość.
 * Klucze muszą być unikatowe.
 *
 */
public class MapExample {

    //HashMap, przechwouje rekordy po swojemu.
    //LinkedHashMap, w kolejnosci dodawania
    //TreeMap, sortuje rekordy po kluczu
    public static void main(String[] args) {
        //deklaracja mapy
        Map<Integer, String> map = new HashMap<>();

        //dodawanie rekordow
        map.put(1, "jeden");
        map.put(2, "dwa");
        map.put(3, "trzy");
        //W przypadku podania klucza, ktory juz istnieje w mapie wartosc pary zostaje nadpisana
        map.put(1, "cztery");

        //Petla po parach
        //map.entrySet() zwraca zbiór rekordów
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Klucz: " + entry.getKey() + " Wartosc: " + entry.getValue());
        }

        //Petla po kluczach
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        //Petla po wartosciach
        for (String value : map.values()) {
            System.out.println(value);
        }

        //map.get(klucz), zwraca wartosc przypisana do podanego klucza
        System.out.println(map.get(1));

        //fajny bajer, gdy nie jestesmy pewnie czy klucz jest w mapie
        System.out.println(map.getOrDefault(5, "domyslna"));
    }

}
