
public class Habit extends Task {
    private Frequency frequency;
    private int countStreak;

    public Habit(int id, String title, String desc, int dueDate, Frequency frequency) {
        super(id, title, desc, dueDate, false);
        this.frequency = frequency;
        this.countStreak = 0;
    }

    public void incrementStreak() {
        countStreak++;
    }

    public void resetStreak() {
        countStreak = 0; 
    }

}
