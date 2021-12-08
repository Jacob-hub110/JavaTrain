package kolekcje;

import kolekcje.zbiory.zadanie2.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {
        Teacher t1 = new Teacher(49, "Biol");
        Teacher t2 = new Teacher(26, "Chem");
        Teacher t3 = new Teacher(39, "Pol");
        Teacher t4 = new Teacher(44, "Ang");
        Teacher t5 = new Teacher(57, "Fr");
        Teacher t6 = new Teacher(26, "Fr");

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        teachers.add(t4);
        teachers.add(t5);
        teachers.add(t6);

        Collections.sort(teachers);

        System.out.println(teachers);
    }

}
