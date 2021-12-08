package kolekcje.zbiory.zadanie2;

import java.util.Set;
import java.util.TreeSet;

public class Zadanie2 {

    public static void main(String[] args) {

        // Stworz klase Teacher z polami age oraz subject.
        // Stworz w main TreeSet na nauczycieli, ktory bedzie ich przechowywal w kolejnosci na podstawie wieku.

        Teacher t1 = new Teacher(49, "Biol");
        Teacher t2 = new Teacher(26, "Chem");
        Teacher t3 = new Teacher(39, "Pol");
        Teacher t4 = new Teacher(44, "Ang");
        Teacher t5 = new Teacher(57, "Fr");
        Teacher t6 = new Teacher(26, "Fr");

        Set<Teacher> teachers = new TreeSet<>();
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        teachers.add(t4);
        teachers.add(t5);
        teachers.add(t6);



        System.out.println(teachers);
    }
}
