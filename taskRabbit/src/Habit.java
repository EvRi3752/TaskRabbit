
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

    // Getter methods
    public Frequency getFrequency(){
        return frequency;
    }

    public int getCountStreak(){
        return countStreak;
    }

    public String toString(){
        return super.toString() +
                String.format(", Frequency: %s, Streak: %d", frequency, countStreak);
    }

}
