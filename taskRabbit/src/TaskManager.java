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

    
}
