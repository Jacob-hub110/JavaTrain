package obiektowe;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Andrzej", "Duda", 43);
        Person person3 = new Person("Jacek", 33);

        person1.setName("Andrzej");

        System.out.println("Imie pierwszej osoby: " + person1.getName());
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
