package pliki.league;

public class LoadApp {
    public static void main(String[] args) {
        /*wczytaj z pliku ligę do aplikacji. Wyświetl wszystkie odbyte mecze*/
        League league = LeagueFileService.loadFromFile();
        System.out.println(league);
    }
}
