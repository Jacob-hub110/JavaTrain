package tablice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

/**
 * Zaprojektuj klase, ktora potrafi wygenerowac rozne tablice.
 * * input dane podane prze uzytkownika bound; size; od do;
 */
class ArrayGeneratorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        out.println("Jaką tablicę chcesz zrobić? Liczbową czy z napisami?( wpisz n lub l ): ");
        String typeOfArray = scanner.nextLine();

        if (typeOfArray.equals("n")) {
            out.println("Literka:");
            String letter = scanner.next();
            out.println("Rozmiar tablicy:");
            int size = scanner.nextInt();
            out.println("Minimalna długość napisu:");
            int min = scanner.nextInt();
            out.println("Maksymalna długość napisu:");
            int max = scanner.nextInt();
            ArrayGenerator inscriptArrayGenerator = new ArrayGenerator();
            inscriptArrayGenerator.inscriptArray(max, size, letter, min);
        } else if (typeOfArray.equals("l")) {
            out.println("Rozmiar tablicy:");
            int size = scanner.nextInt();
            out.println("Zakres liczb w tablicy od:");
            int min = scanner.nextInt();
            out.println("Zakres liczb w tablicy do:");
            int max = scanner.nextInt();
            ArrayGenerator numArrayGenerator = new ArrayGenerator();
            numArrayGenerator.numArray(size, min, max);
        } else {
            exit(0);
        }
    }
}


class ArrayGenerator {

    public void numArray(int size, int min, int max) {
        Random random = new Random();
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(max - min) + min;
        }
        out.println(Arrays.toString(nums));
        out.println("Liczby w tablicy o rozmiarze " + size + " są z zakresu od " + min + " do " + max + " włącznie");
    }

    public void inscriptArray(int max, int size, String letter, int min) {

        String[] inscripts = new String[size];
        Random random = new Random();
        for (int i = 0; i < inscripts.length; i++) {
            String temp = "";
            int randomNumber = random.nextInt(max - min) + min;
            for (int j = 0; j < randomNumber; j++) {
                temp += letter;
            }
            inscripts[i] = temp;
        }
        out.println(Arrays.toString(inscripts));
        out.println("Stringi w tablicy o rozmiarze " + size + " są z zakresu od " + min + " do " + max + " włącznie");
    }
}



