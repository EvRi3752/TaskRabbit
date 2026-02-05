import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; 

public class TaskManager {
    
    private final List<Task> tasks; 

    public TaskManager(){
        this.tasks = new ArrayList<>(); 
    }

    // core method

    public void addTask(Task task) {
        if(task == null) {
            throw new IllegalArgumentException("Task cannot be null"); 
        }

        tasks.add(task); 
    }

    public boolean removeTask(int id){
        return tasks.removeIf(t -> t.getId() == id);
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }

    public List<Habit> getAllHabits(){
        return tasks.stream()
        .filter(t-> t instanceof Habit)
        .map(t-> (Habit) t)
        .collect(Collectors.toList()); 
    }

    public Frequency getFrequency(){
        return frequency;
    }

    public int getCountStreak(){
        return countStreak; 
    }

    @Override
    public String toString(){
        return super.toString() +
                String.format(", Frequency: %s, Streak: %d", frequency, countStreak);
    }

    // Search method

    public List<Task> searchByTitle(String keyword){
        if (keyword == null || keyword.isBlank()){
            return List.of(); 
        }

        String lower = keyword.toLowerCase(); 
        return tasks.stream()
                 .filter(t -> t.getTitle().toLowerCase().contains(lower))
                 .collect(Collectors.toList()); 
    }

    public Task getTaskById(int id){
        return tasks.stream()
        .filter(t -> t.getId() == id)
        .findFirst()
        .orElse(null); 
    }

    // Task marking
    public boolean markTaskCompleted(int id){
        Task t = getTaskById(id); 
        if(t == null) return false; 
        t.markCompleted();
        return true;
    }

    public boolean markTaskIncomplete(int id){
        Task t = getTaskById(id);
        if (t == null) return false; 
        t.markIncomplete();
        return true; 
    }

    // Streaks

    public boolean incrementHabitStreak(int id){
        Task t = getTaskById(id);
        if (t instanceof Habit habit){
            habit.incrementStreak();
            return true;
        }
        return false; 
    }

    public boolean resetHabitStreak(int id) {
        Task t = getTaskById(id);
        if (t instanceof Habit habit){
            habit.resetStreak();
            return true;
        }
        return false; 
    }

    
}
