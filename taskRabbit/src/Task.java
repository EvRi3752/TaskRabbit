
public class Task {
    private int id;
    private String title;
    private String desc;
    private int dueDate;
    private boolean isCompleted;

    public Task(int id, String title, String desc, int dueDate, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.dueDate = dueDate;
        this.isCompleted = isCompleted;
    }

    public String toString() { // toString method converts variables into a string when printed
        return String.format("ID: %s, Title: %s, Desc: %s, DueDate: %s, isCompleted: %s", id, title, desc, dueDate,
                isCompleted);
    }

    public void markCompleted() {
        this.isCompleted = true;
    }

    public void markIncomplete() {
        this.isCompleted = false;
    }

    // Retreival methods

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title; 
    }

    public String getDesc(){
        return desc; 
    }

    public boolean isCompleted(){
        return isCompleted; 
    }

}
