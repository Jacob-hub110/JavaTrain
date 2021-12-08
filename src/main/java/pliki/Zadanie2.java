package pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * ❖ Przygotuj plik „villages.txt” z nazwami wiosek (każda nazwa w
 * oddzielnej linii).
 * ❖ Plik powinien zostać umieszczony w głównym katalogu projektu.
 * ❖ Napisz metodę main, która wyświetli wszystkie nazwy z pliku na
 * konsoli
 */
public class Zadanie2 {
    public static void main(String[] args) {
       try {
           File villages = new File("villages.txt");
           Scanner scanner = new Scanner(villages);
           while(scanner.hasNextLine()) {
               System.out.println(scanner.nextLine());
           }
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
    }
}
