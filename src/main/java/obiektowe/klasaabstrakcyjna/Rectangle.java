package obiektowe.klasaabstrakcyjna;

public class Rectangle extends Figure {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double calculateArea() {
        return a * b;
    }

    @Override
    double calculateCircuit() {
        return 2 * a + 2 * b;
    }
}
