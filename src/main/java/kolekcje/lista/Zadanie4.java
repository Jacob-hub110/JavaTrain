package kolekcje.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Stworz dwie listy, jedna na liczby parzyste druga na nieprzyste.
 * Dodaj liczby od 1 do 20 do odpowiednich list.
 * Wyswietl obie listy.
 * Stworz nowa liste, do ktorej dodasz dwie juz istniejace.
 * Wyswietl nowa liste.
 */
public class Zadanie4 {

    private static void listForListsMaker(List<Integer> list) {
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        List<Integer> listForLists = new ArrayList<>();

        for (Integer num : list) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }

        listForLists.addAll(evenList);
        listForLists.addAll(oddList);

        System.out.println("Parzyste: " + evenList);
        System.out.println("Nieparzyste: " + oddList);
        System.out.println("Lista na listy: " + listForLists);
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        listForListsMaker(list1);
    }
}
