package pliki.league;

import java.util.Arrays;

public class SaveApp {
    public static void main(String[] args) {
        Game game1 = new Game("FC Barcelona", "Real Madryt", 3, 2);
        Game game2 = new Game("Arsenal Londyn", "Bayern Monachium", 3, 1);
        Game game3 = new Game("Legia Warszawa", "Korona Kielce", 3, 0);
        Game game4 = new Game("Miami Dolphins", "New England Patriots", 35, 0);
        League league = new League(Arrays.asList(game1, game2, game3, game4));

        LeagueFileService.save(league);
    }
}
