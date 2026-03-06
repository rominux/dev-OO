package tp04;

import java.util.ArrayList;

public class UseYearGroup {
    public static void main(String[] args) {
        StudentAbs a = new StudentAbs("A", "A", new double[]{10.0});
        StudentAbs b = new StudentAbs("B", "B", new double[]{7.0});
        StudentAbs c = new StudentAbs("C", "C", new double[]{10.0});
        c.setNbAbsence(10);
        StudentAbs d = new StudentAbs("D", "D", new double[]{6.0});
        d.setNbAbsence(6);
        YearGroup yg = new YearGroup();
        yg.addStudent(a);
        yg.addStudent(b);
        ArrayList<StudentAbs> list = new ArrayList<StudentAbs>();
        list.add(c);
        list.add(d);
        yg.addStudent(list);
        yg.addGrades(new double[]{15.0, 3.0, 17.0, 2.0});
        yg.validation(5, 12);
    }
}