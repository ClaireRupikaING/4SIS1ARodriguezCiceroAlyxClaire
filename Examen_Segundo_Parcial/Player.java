import javax.swing.*;
import javax.swing.SwingUtilities;


public class Player {
    private String name;
    private int totalScore;

    public Player() {
        this.totalScore = 0;
    }

    public String getName() {
        return name;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void updateScore(int score) {
        totalScore += score;
    }

    public void setPlayerName(String name) {

        if (name.length() <= 6) {
            this.name = name;
        } else {
            
            this.name = name.substring(0, 6);
        }
    }
}
