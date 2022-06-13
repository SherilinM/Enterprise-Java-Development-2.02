package threefourfive;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks = new ArrayList<>();

    public void addToList(Task task) {
        tasks.add(task);
    }

    public void changeToFinished(int index) {
        tasks.get(index).setFinished(true);
    }

    public boolean isTaskFinished(int index) {
        return tasks.get(index).isFinished();
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}