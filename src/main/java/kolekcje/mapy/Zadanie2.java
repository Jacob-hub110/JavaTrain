package kolekcje.mapy;

import java.util.*;

/**
 * Stworz klase Student (firstname, lastname, age)
 * W main:
 * Stworz mape, gdzie kluczem bedzie Student a wartoscia bedzie lista jego ocen.
 * W main stworz kilku studentow oraz ich oceny a nastepniej dodaj dane do mapy.
 * Wyswietl zawartosc mapy na konsoli, tak aby w miare czytelnie dalo sie odczytac informacje w niej zawarte.
 * np. Andrzej Kowalski 21 - 2, 3, 5, 4, 3
 *
 * Stworz klase StudentService, zawiarajaca ponizsze metody:
 *
 * double calculateAverage(List<Integer> grades) - metoda oblicza srednia ocen
 * double calculateTotalAverage(Map<Student, List<Integer>> studentToGrades) - oblicza srednia ze srednich kazdego studenta
 * Student findBestStudent(Map<Student, List<Integer>> studentToGrades) - zwraca studenta z najlepsza srednia
 */
public class Zadanie2 {

    public static void main(String[] args) {
        Map<Student, List<Integer>> map = new HashMap<>();
        Student s1 = new Student("Jan", "Kowalski", 16);
        Student s2 = new Student("Katarzyna", "Wodzirej", 15);
        Student s3 = new Student("Małgorzata", "Mielich", 14);
        Student s4 = new Student("Małgorzata", "Mielich", 14);
        List<Integer> s1Grades = Arrays.asList(3,3,5,1);
        List<Integer> s2Grades = Arrays.asList(1,1,2,1);
        List<Integer> s3Grades = Arrays.asList(6,6,5,6);
        List<Integer> s4Grades = Arrays.asList(6,6,6,6);
        map.put(s1, s1Grades);
        map.put(s2, s2Grades);
        map.put(s3, s3Grades);
        map.put(s4, s4Grades);

        for (Map.Entry<Student, List<Integer>> entry : map.entrySet()) {
            System.out.println(entry);
        }

        System.out.println(StudentService.calculateAverage(s2Grades));
        System.out.println(StudentService.calculateTotalAverage(map));
        System.out.println(StudentService.findBestStudent(map));
    }
}
