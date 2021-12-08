package pliki.league;

import java.util.List;

public class League {
    private List<Game> games;

    public League(List<Game> games) {
        this.games = games;
    }

    public List<Game> getGames() {
        return games;
    }

    @Override
    public String toString() {
        return "League{" +
                "games=" + games +
                '}';
    }
}
