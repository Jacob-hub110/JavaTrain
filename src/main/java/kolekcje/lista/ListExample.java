package kolekcje.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        //Deklaracja i inicjalizacja listy
        List<String> list = new ArrayList<>();

        //Dodawanie do listy na koniec
        list.add("Poniedzialek");
        list.add("Wtorek");
        list.add("Sroda");

        //Dodawanie elementu w konkretne miejsce
        list.add(0, "Czwartek");

        //Lista ma nadpisany toString wiec latwo ja zaprezentowac
        System.out.println(list);

        System.out.println(list.size());

        //Usuwanie po indexie
        list.remove(0);

        //Usuwanie po obiekcie
        list.remove("Wtorek");

        System.out.println(list);

        //Czy lista zawiera jakis element
        System.out.println(list.contains("Sroda"));

        //Czyszczenie listy
        list.clear();

        System.out.println(list);

        //Statyczna deklaracja listy
        List<String> secondList = Arrays.asList("a", "b", "c", "d");
        System.out.println(secondList);

        //Przechodzenie po liscie
        //for i
        System.out.println("-- for i --");
        for (int i = 0; i < secondList.size(); i++) {
            System.out.print(secondList.get(i) + " ");
        }
        System.out.println();

        //foreach
        System.out.println("-- for each --");
        for (String element : secondList) {
            System.out.print(element + " ");
        }
        System.out.println();

        //iterator
        System.out.println("-- iterator --");
        Iterator<String> it = secondList.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        //stream
        System.out.println("-- stream --");
        secondList.forEach(el -> System.out.print(el + " "));
    }
}
