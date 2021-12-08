package kolekcje.lista;

import java.util.ArrayList;
import java.util.List;

public class Zadanie2 {

    public static void main(String[] args) {
        //Lista utworzona w ten sposob jest niemodyfikowalna. To znaczy ze nie mozna do niej dodac lub usunac elementu.
        //List<Integer> NUMBERS = Arrays.asList(5, 4, 1, 8, 19);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(1);

        //Usun liczbe 8 nie uzywajac indexu
        numbers.remove(Integer.valueOf(8));

        System.out.println(numbers);
    }

}
