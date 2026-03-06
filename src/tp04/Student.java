package tp04;

import java.util.Arrays;

public class Student {
    private Person pers;
    private double[] grades;

    private Student(Person pers, double[] grades) {
        this.pers = pers;
        this.grades = grades;
    }
    public Student(String forename, String name, double[] grades) {
        this(new Person(forename, name), grades);
    }
    public Student(String forename, String name, double grade) {
        this(forename, name, new double[]{grade});
    }
    
    public String toString() {
        return "Student[" + this.pers.toString() + " = " + Arrays.toString(this.grades) + "]";
    }
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        if (this.pers == null && other.pers != null) return false;
        if (!this.pers.equals(other.pers)) return false;
        if (this.grades == null && other.grades != null) return false;
        if (!Arrays.equals(this.grades, other.grades)) return false;
        return true;
    }

    public double getAverage() {
        double sum = 0.0;
        for (int i = 0; i<this.grades.length; i++) {
            sum += this.grades[i];
        }
        if (this.grades.length == 0) {
            return 0.0;
        }
        return sum / (double) this.grades.length;
    }
    public void addGrade(double aGrade) {
        this.grades = Arrays.copyOf(this.grades, this.grades.length+1);
        this.grades[this.grades.length-1] = aGrade;
    }
    public void setName(String v) {
        this.pers.setName(v);
    }
    public void setForename(String v) {
        this.pers.setForename(v);
    }
    public String getName() {
        return this.pers.getName();
    }
    public String getForename() {
        return this.pers.getForename();
    }
    public int getId() {
        return this.pers.getId();
    }
}