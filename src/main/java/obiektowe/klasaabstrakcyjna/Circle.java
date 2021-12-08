package obiektowe.klasaabstrakcyjna;

public class Circle extends Figure {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    double calculateCircuit() {
        return 2 * Math.PI * r;
    }
}
