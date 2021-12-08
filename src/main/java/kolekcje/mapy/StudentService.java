package kolekcje.mapy;

import java.util.List;
import java.util.Map;

public class StudentService {
    static double calculateAverage(List<Integer> grades) {
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    static double calculateTotalAverage(Map<Student, List<Integer>> studentToGrades) {
        double sum = 0;

        for (List<Integer> value : studentToGrades.values()) {
            sum += calculateAverage(value);
        }

        return sum / studentToGrades.size();
    }

    static Student findBestStudent(Map<Student, List<Integer>> studentToGrades) {
        double maxAverage = 0.0;
        Student bestStudent = null;

        for (Map.Entry<Student, List<Integer>> entry : studentToGrades.entrySet()) {
            if (calculateAverage(entry.getValue()) > maxAverage) {
                maxAverage = calculateAverage(entry.getValue());
                bestStudent = entry.getKey();
            }
        }

        return bestStudent;
    }
}

