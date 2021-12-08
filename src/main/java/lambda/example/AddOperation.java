package lambda.example;

public class AddOperation implements ArithmeticOperation {

    @Override
    public double operation(double a, double b) {
        return a + b;
    }
}