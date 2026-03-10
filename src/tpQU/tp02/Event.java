package tpQU.tp02;

import java.time.LocalDate;

import tpOO.tp03.Task;
import tpOO.tp03.ToDoList;

public class Event {
    private String label;
    private String place;
    private LocalDate start;
    private LocalDate end;
    private ToDoList tasks;

    Event(String label, String place, LocalDate start, LocalDate end, ToDoList tasks) {
        this.label = label;
        this.place = place;
        this.start = start;
        this.end = end;
        if (start.isAfter(end)) {
            this.end = this.start;
        }
        this.tasks = tasks;
    }
    Event(String label, String place, LocalDate start, LocalDate end) {
        this(label, place, start, end, new ToDoList());
    }
    Event(String label, String place, LocalDate start) {
        this(label, place, start, start.plusDays(1));
    }
    Event(String label, String place) {
        this(label, place, LocalDate.now());
    }

    public String getLabel() {return label;}
    public String getPlace() {return place;}
    public LocalDate getStart() {return start;}
    public LocalDate getEnd() {return end;}
    public ToDoList getTasks() {return tasks;}
    public String toString() {
        return label + " - " + place + ": \t " + start + " -> " + end;
    }
    void addTask(Task aTask) {tasks.addTask(aTask);}
    void removeTask(Task aTask) {tasks.removeTask(aTask);}
    void removeTask(int i) {tasks.removeTask(i);}
    int getNbTasks() {return tasks.getNbTasks();}
    Task[] getChores() {return tasks.getChores();}
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Event other = (Event) obj;
        if (this.label != null && !this.label.equals(other.label)) return false;
        if (this.place != null && !this.place.equals(other.place)) return false;
        if (this.start != null && !this.start.equals(other.start)) return false;
        if (this.end != null && !this.end.equals(other.end)) return false;
        return true;
    }
    public boolean overlap(Event evt) {
        return (this.end.isAfter(evt.start) && !this.end.isAfter(evt.end)) || (this.start.isBefore(evt.end) && !this.start.isBefore(evt.start));
    }
}
