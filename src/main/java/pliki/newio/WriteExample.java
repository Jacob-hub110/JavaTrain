package pliki.newio;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteExample {
    public static void main(String[] args) {

        Path path = Paths.get("file.txt");

        //try-with-resources zapewnia użycie close na stworzony obiekcie Closable
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("Przyklad zapisu za pomoca try-with-resources");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
