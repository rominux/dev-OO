package tp04;

public class StudentAbs {
    private int nbAbsence;
    private Student etu;

    public StudentAbs(String forename, String name, double[] grades) {
        this.etu = new Student(forename, name, grades);
    }
    public StudentAbs(String forename, String name, double grade) {
        this(forename, name, new double[]{grade});
    }
    public double getAverage() {
        return this.etu.getAverage();
    }
    public void addGrade(double aGrade) {
        this.etu.addGrade(aGrade);
    }
    public void setName(String v) {
        this.etu.setName(v);
    }
    public void setForename(String v) {
        this.etu.setForename(v);
    }
    public String getName() {
        return this.etu.getName();
    }
    public String getForename() {
        return this.etu.getForename();
    }
    public int getId() {
        return this.etu.getId();
    }
    public int getNbAbsence() {
        return this.nbAbsence;
    }
    public void setNbAbsence(int v) {
        this.nbAbsence = v;
    }
    @Override
    public String toString() {
        return this.etu.toString() + ", nbAbs=" + this.nbAbsence;
    }

    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        StudentAbs other = (StudentAbs) obj;
        if (this.etu == null && other.etu != null) return false;
        if (!this.etu.equals(other.etu)) return false;
        if (this.nbAbsence != other.nbAbsence) return false;
        return true;
    }
    boolean warning(int thresholdAbs, double thresholdAvg) {
        return this.nbAbsence >= thresholdAbs || this.getAverage() <= thresholdAvg;
    }
    boolean validation(int thresholdAbs, double thresholdAvg) {
        return this.nbAbsence < thresholdAbs && this.getAverage() > thresholdAvg;
    }
}