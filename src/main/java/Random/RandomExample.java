package Random;

import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {

        Random random = new Random();

        //Losuje liczbe z calego przedzialu int
        int number = random.nextInt();
        System.out.println(number);

        //Losuje liczbe z przedzialu od 0 do 9
        number = random.nextInt(10);
        System.out.println(number);

        //Losuje liczbe z przedzialu od 10 do 19
        number = random.nextInt(10) + 10;
        System.out.println(number);
    }

}
