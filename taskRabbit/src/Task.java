import java.util.ArrayList;

public class Task {
    int id;
    String title;
    String desc;
    int dueDate;
    boolean isCompleted;

    public Task(int id, String title, String desc, int dueDate, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.dueDate = dueDate;
        this.isCompleted = isCompleted;
    }

    public String toString() { // toString method converts variables into a string when printed
        return String.format("ID: %s, Title: %d, Desc: %s, DueDate: %s, isCompleted: %s", id, title, desc, dueDate,
                isCompleted);
    }

    public boolean markCompleted() {
        if (isCompleted == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean markIncomplete() {
        if (isCompleted == false) {
            return true;
        } else {
            return false;
        }
    }

}
