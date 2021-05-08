package nineboxpuzzle;

import java.util.Comparator;

public class PlayerDetails implements Comparable<PlayerDetails> {
    private String name;
    private int score;

    public PlayerDetails(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    
    @Override
    public String toString() {
        return name + "\t" + score;
    }

    @Override
    public int compareTo(PlayerDetails o) {
        return this.getScore() - o.getScore();
    }
}
