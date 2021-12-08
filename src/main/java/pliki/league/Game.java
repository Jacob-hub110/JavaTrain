package pliki.league;

public class Game {
    private String teamA;
    private String teamB;
    private int scoreA;
    private int scoreB;

    public Game(String teamA, String teamB, int scoreA, int scoreB) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.scoreA = scoreA;
        this.scoreB = scoreB;
    }

    public String getTeamA() {
        return teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public int getScoreA() {
        return scoreA;
    }

    public int getScoreB() {
        return scoreB;
    }

    @Override
    public String toString() {
        return "Game{" +
                "teamA='" + teamA + '\'' +
                ", teamB='" + teamB + '\'' +
                ", scoreA=" + scoreA +
                ", scoreB=" + scoreB +
                '}';
    }
}
