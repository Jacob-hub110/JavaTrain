package kolekcje.zbiory.zadanie2;

import java.util.Comparator;
import java.util.Objects;

public class Teacher implements Comparable<Teacher> {

    public static final Comparator<Teacher> BY_SUBJECT = Comparator.comparing(Teacher::getSubject);

    private int age;
    private String subject;

    public Teacher(int age, String subject) {
        this.age = age;
        this.subject = subject;
    }

    public int getAge() {
        return age;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher teacher = (Teacher) o;
        return getAge() == teacher.getAge() && Objects.equals(getSubject(), teacher.getSubject());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getSubject());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", subject='" + subject + '\'' +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        int result = Integer.compare(this.age, o.getAge());
        if (result != 0) {
            return result;
        }
        result = this.subject.compareTo(o.getSubject());
        return result;
    }
}
