package watki;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Po kolei, posiadamy uchwyt do wątku
        final Worker tadek = new Worker("Tadek");
        final Worker marek = new Worker("marek");
        final Worker jurek = new Worker("jurek");
        final Worker grzesiek = new Worker("grzesiek");

        final List<Worker> workers = Arrays.asList(tadek, marek, jurek, grzesiek);

        for (Worker worker : workers) {
            Thread thread = new Thread(worker);
            thread.start();
        }
    }
}
