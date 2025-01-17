import java.util.ArrayList;
import java.util.List;

public class TodoApp {
    private List<String> tasks;

    public TodoApp() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public static void main(String[] args) {
        TodoApp app = new TodoApp();
        app.addTask("Learn Java");
        app.addTask("Build a To-Do List");
        System.out.println("Tasks: " + app.getTasks());
        app.removeTask("Learn Java");
        System.out.println("Tasks after removal: " + app.getTasks());
    }
}
