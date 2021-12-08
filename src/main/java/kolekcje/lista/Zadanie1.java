package kolekcje.lista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Zadanie1 {

    //Stworz liste liczb calkowitych.
    //Wypelnij je losowymi liczbami z zakresu od 0 do 10.
    //Wyswietl zawartosc listy.
    //Usun z listy wszystkie liczby nieparzyste
    //Wyswietl zawartosc listy
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(11));
        }

        System.out.println(integers);

        //Usuwanie w petli Java 7
        /*Iterator<Integer> it = integers.iterator();
        while(it.hasNext()) {
            if (it.next() % 2 != 0) {
                it.remove();
            }
        }*/

        //Usuwanie od Javy 8
        integers.removeIf(num -> num % 2 != 0);

        System.out.println(integers);
    }

}
