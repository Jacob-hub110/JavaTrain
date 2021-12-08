package inkrementacja;

public class IncrementationExample {

    public static void main(String[] args) {

        int number = 10;

        //Post inkrementacja, number zostanie zwiekszone po przekazaniu do metody println
        System.out.println(number++);   // 10
        //Pre inkrementacja, numer odrazu zostaje zwiekszone
        System.out.println(++number);   // 12
        System.out.println(number++);   // 12

        //Analogicznie jak wyzej tylko odejmujemy
        System.out.println(number--);   // 13
        System.out.println(--number);   // 11
        System.out.println(number--);   // 11
    }

}
