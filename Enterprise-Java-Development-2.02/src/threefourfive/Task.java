package threefourfive;

public class Task {
    private String name;
    private boolean isFinished;

    public Task(String name, boolean isFinished) {
        this.name = name;
        this.isFinished = isFinished;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }
}