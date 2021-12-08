package obiektowe.dziedziczenie;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    void voice(){
        System.out.println("miaumiau");
    }

}
