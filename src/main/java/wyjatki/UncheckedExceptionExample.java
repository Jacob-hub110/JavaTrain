package wyjatki;

//Unchecked / runtime exception
//Tych wyjatkow nie trzeba obslugiwac.
//Zwykle sa wynikiem bledu programisty.
public class UncheckedExceptionExample {

    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println(arr[10]);
    }

}
