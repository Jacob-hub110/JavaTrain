package lambda.example;

public class Main {

    public static void main(String[] args) {

        //Za pomoca klasy
        ArithmeticOperation arithmeticOperation = new AddOperation();

        double sum = arithmeticOperation.operation(5, 10);

        System.out.println(sum);

        //Za pomoca klasy anonimowej
        arithmeticOperation = new ArithmeticOperation() {
            @Override
            public double operation(double a, double b) {
                return a - b;
            }
        };

        double subtractResult = arithmeticOperation.operation(10, 5);

        System.out.println(subtractResult);

        //Za pomoca lambdy
        arithmeticOperation = (a, b) -> a * b;

        double multiplyResult = arithmeticOperation.operation(5, 5);

        System.out.println(multiplyResult);

        arithmeticOperation = (a, b) -> a / b;

        double divideResult = arithmeticOperation.operation(5, 5);

        System.out.println(divideResult);
    }
}
