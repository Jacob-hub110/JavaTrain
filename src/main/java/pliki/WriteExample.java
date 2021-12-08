package pliki;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteExample {

    public static void main(String[] args) {

       try {
           PrintWriter printWriter = new PrintWriter("file.txt");
           printWriter.println("Linia pierwsza...");
           printWriter.println("Linia druga...");
           printWriter.close();
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
    }

}
