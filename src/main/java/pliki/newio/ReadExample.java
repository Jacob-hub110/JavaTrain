package pliki.newio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadExample {

    public static void main(String[] args) {

        //Podatne na OutOfMemory
        try {
            Path path = Paths.get("file.txt");
            List<String> lines = Files.readAllLines(path);

            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Rozwiazanie na out of memeory
        try {
            Path path = Paths.get("file.txt");
            Files.lines(path)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
