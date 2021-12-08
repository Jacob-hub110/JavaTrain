package wyjatki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//CheckedException to takie wyjatki, ktore trzeba obslugiwac lub przekazac dalej.
public class CheckedExceptionExample {

    public static void main(String[] args) {

        File file = new File("file.txt");

        //Obsluga
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(method(3));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String method(int number) throws Exception {
        if (number > 5) {
            throw new Exception();
        }
        return "ok";
    }

}
