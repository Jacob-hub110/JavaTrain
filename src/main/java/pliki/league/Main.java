package pliki.league;

import java.util.Arrays;

/**1. Stwórz klasę Game(teamA, teamB, scoreA, scoreB), która będzie
 * reprezentować rozegrany mecz.
 * 2. Stwórz klasę League, która będzie posiadać historie meczy(lista).
 * 3. Utwórz klasę LeagueFileService.
 * 4. W LeagueFileService utwórz metodę void save(League), która zapisze do
 * pliku tekstowego informację o obiekcie typu League. Format dowolny, ma
 * działać ☺
 * 5. Utwórz także metodę loadFromFile(), która na podstawie pliku tekstowego
 * zwróci obiekt League. Stan obiektu powinien być taki jak przy zapisywaniu.
 * 6. Stwórz klasy SaveApp, LoadApp zawierające po jednej metodzie main.
 * 7. W SaveApp.main utwórz i wypełnij ligę. Zapisz stan ligi do pliku.
 * 8. W LoadApp.main wczytaj z pliku ligę do aplikacji. Wyświetl wszystkie
 * odbyte mecze aby zweryfikować czy zostały wczytane poprawnie*/
public class Main {

    public static void main(String[] args) {

        String text = "ala.ma.kota.pl";
        String[] array = text.split("\\.");
        System.out.println(Arrays.toString(array));

    }

}
