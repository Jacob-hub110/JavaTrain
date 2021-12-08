package pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ❖ W metodzie main stwórz listę typu String i uzupełnij ją nazwami stolic
 * europejskich.
 * ❖ Na podstawie listy, wygeneruj plik „capitols.txt”, który będzie
 * zawierał spis stolic (każda w oddzielnej linii).
 * ❖ Zweryfikuj czy plik został poprawnie utworzony, domyślnie bez
 * podania dodatkowej ścieżki powinien utworzyć się w projekcie
 */
public class Zadanie1 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(Arrays.asList("berlin", "warszawa", "rzym", "paryż"));

        try {
            PrintWriter printWriter = new PrintWriter("capitols.txt");
            cities.forEach(printWriter::println);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
