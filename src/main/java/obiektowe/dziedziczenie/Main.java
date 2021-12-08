package obiektowe.dziedziczenie;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("zwierz", 3);
        Animal dog = new Dog("owczarek", 4, "tak");
        Animal cat = new Cat("filemon", 2);
        Parrot parrot = new Parrot("ara", 30, "Czerwona");

        //Stworz tablice na zwierzeta i uzyj w petli metody voice.

        Animal[] animals = {animal, dog, cat, parrot};

        for (Animal a : animals) {
            a.voice();
        }
    }
}
