package tp04;

import java.util.ArrayList;

public class YearGroup {
    ArrayList<StudentAbs> yg;
    public YearGroup() {
        this.yg = new ArrayList<StudentAbs>();
    }

    public void addStudent(StudentAbs other) {
        this.yg.add(other);
    }
    public void addStudent(ArrayList<StudentAbs> others) {
        this.yg.addAll(others);
    }
    public void addGrades(double[] aTest) {
        for (int i = 0; i<yg.size(); i++) {
            yg.get(i).addGrade(aTest[i]);
        }
    }
    public void validation(int thresholdAbs, int thresholdAvg) {
        for (int i = 0; i<yg.size(); i++) {
            if (yg.get(i).validation(thresholdAbs, thresholdAvg)) {
                System.out.println(yg.get(i));
            }
        }
    }
}