package obiektowe.klasaabstrakcyjna;

public class Main {

    //Stworz klase Figure, ktora bedzie posiadala dwie metody: calculateArea i calculateCircuit.
    //Stworz klase Rectangle, ktora bedzie dziedziczyc po Figure i implementowac jej metody. Pola na dwa boki.
    //Analgoicznie dla klasy Circle. Pole na promien.
    public static void main(String[] args) {
        Figure rectangle = new Rectangle(2, 4);
        Figure circle = new Circle(1);
        Triangle triangle = new Triangle();

      // Nie mozna stworzyc obiektu klasy abstrakcyjnej ---- NIE MA CZEGOS TAKIEGO ---->> Figure f = new Figure();

        System.out.println("Rectangle");
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculateCircuit());

        System.out.println("Circle");
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircuit());

        System.out.println("Triangle");
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculateCircuit());
    }
}


