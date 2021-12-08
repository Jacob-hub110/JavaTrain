package kolekcje;

import kolekcje.zbiory.zadanie2.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static kolekcje.zbiory.zadanie2.Teacher.BY_SUBJECT;

public class ComparatorExample {

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

        Collections.sort(teachers, new ByAgeComparator());

        System.out.println(teachers);

        //Klasa anonimowa
        Collections.sort(teachers, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getSubject().compareTo(o2.getSubject());
            }
        });

        //Lambda
        Collections.sort(teachers, (o1, o2) -> o1.getSubject().compareTo(o2.getSubject()));

        //Docelowe rozwiazanie za pomoca stalej w klasie Teacher, przydatne metody z klasy Comparator
        Collections.sort(teachers, Teacher.BY_SUBJECT);

        //Docelowe rozwiazanie, przydatne metody z klasy Comparator
        Collections.sort(teachers, Comparator.comparing(Teacher::getSubject).thenComparing(Teacher::getAge));


        System.out.println(teachers);
    }

}
