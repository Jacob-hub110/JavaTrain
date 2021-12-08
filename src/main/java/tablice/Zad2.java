package tablice;

import java.util.Random;

public class Zad2 {

    /**
     * 1. Stworz 10 elementowa tablice typu int wypelniona dowolnymi liczbami. Tablice stworz za pomoca zapisu z klamrami {}.
     * 2. Wyswietl najwieksza i najmniejsza liczbe z tablicy.
     * 3. Wyswietl sume liczb z tablicy.
     */
    public static void main(String[] args) {
        int[] array = {50, 20, 11, 55};

        System.out.println("Sum: " + calculateSum(array));
        System.out.println("Max: " + calculateMax(array));
        System.out.println("Min: " + calculateMin(array));
    }

    public static int calculateMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }

    public static int calculateMin(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }}


