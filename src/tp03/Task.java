package tp03;

import java.time.LocalDate;

class Task {
    private int idTask;
    private LocalDate creationDate;
    private LocalDate deadline;
    private TaskStatus state;
    private String description;
    private int duration;
    private static int idCounter = 0;

    Task(String description, int duration) {
        this.description = description;
        this.duration = duration;
        this.creationDate = LocalDate.now();
        this.deadline = this.creationDate.plusYears(10);
        this.state = TaskStatus.TODO;
        this.idTask = Task.idCounter;
        Task.idCounter++;
    }
    Task(String description, LocalDate creation, LocalDate deadline, int duration) {
        this.description = description;
        this.duration = duration;
        this.creationDate = creation;
        this.deadline = deadline;
        this.state = TaskStatus.TODO;
        this.idTask = Task.idCounter;
        Task.idCounter++;
    }
    public String toString() {
        return "T" + this.idTask + " = " + this.description + ":" + this.state + "(" + this.duration + "):" + this.deadline;
    }
    public void changeStatus() {
        this.state = TaskStatus.values()[this.state.ordinal() + 1 % TaskStatus.values().length];
    }
    public void changeStatus(TaskStatus st) {
        this.state = st;
    }
    public boolean isLate() {
        if(this.state == TaskStatus.FINISHED) return false;
        return LocalDate.now().isAfter(this.deadline);
    }
    public void delay(int nbDays) {
        this.deadline = this.deadline.plusDays(nbDays);
    }
}
