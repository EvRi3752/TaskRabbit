public class Habbit {
    int frequency;
    int countStreak;

    public Habbit(int frequency, int countStreak) {
        this.frequency = frequency;
        this.countStreak = countStreak;
    }

    public int incrementStreak() {
        if (frequency == countStreak) {
            return countStreak++;
        } else {
            return 0;
        }
    }

    public int resetStreak() {
        return 0;
    }

}
