package threefourfive;

import threefourfive.TaskList;

public class Student {
    private String name;
    private int age;
    private TaskList tasks;

    public Student(String name, int age, TaskList tasks) {
        this.name = name;
        this.age = age;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskList getTasks() {
        return tasks;
    }

    public void setTasks(TaskList tasks) {
        this.tasks = tasks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}