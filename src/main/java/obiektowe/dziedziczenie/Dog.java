package obiektowe.dziedziczenie;

public class Dog extends Animal {
    private String race;

    public Dog(String name, int age, String race) {
        super(name, age);
        this.race = race;
    }
    @Override
    void voice() {
        System.out.println("hauhau");
    }

}
