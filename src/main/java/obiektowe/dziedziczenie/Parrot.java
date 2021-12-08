package obiektowe.dziedziczenie;

public class Parrot extends Animal {
    private String colour;

    public Parrot(String name, int age, String colour) {
        super(name, age);
        this.colour = colour;
    }

    @Override // adnotacja wywala błąd jak nie nadpisałem metody
    void voice() {
        System.out.println("kkk");
    }

}
