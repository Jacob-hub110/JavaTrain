package kolekcje;

import kolekcje.zbiory.zadanie2.Teacher;

import java.util.Comparator;

public class ByAgeComparator implements Comparator<Teacher> {

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

}
