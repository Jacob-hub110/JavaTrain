package tablice;

import java.util.Arrays;
import java.util.Random;

public class Zad3 {

    /**
     * Stworz 10 elementowa tablice intow, z losowymi liczbami z przedzialu od  10 do 20.
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(11) + 10;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
