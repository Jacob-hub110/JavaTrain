package pliki.league;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class LeagueFileService {

    private static final String SEPARATOR = ":";

    public static void save(League league) {
        final Path path = Paths.get("League.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (Game game : league.getGames()) {
                writer.write(mapToString(game) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static League loadFromFile() {
        try {
            final Path path = Paths.get("League.txt");
            final List<String> lines = Files.readAllLines(path);

            final List<Game> games = lines.stream()
                    .map(LeagueFileService::parseToGame)
                    .collect(Collectors.toList());

            return new League(games);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    private static String mapToString(Game game) {
        return game.getTeamA() + SEPARATOR + game.getScoreA() + SEPARATOR + game.getScoreB() + SEPARATOR + game.getTeamB();
    }

    private static Game parseToGame(String line) {
        final String[] array = line.split(SEPARATOR);
        return new Game(array[0], array[3], Integer.parseInt(array[1]), Integer.parseInt(array[2]));
    }

}
