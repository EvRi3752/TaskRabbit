import java.util.ArrayList;

public class Habit {
    int frequency;
    int countStreak;

    public Habit(int frequency, int countStreak) {
        this.frequency = frequency;
        this.countStreak = countStreak;
    }

    public void incrementStreak() {
        countStreak++;
    }

    public void resetStreak() {
        countStreak = 0; 
    }

}
