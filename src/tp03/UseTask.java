package tp03;

import java.time.LocalDate;

public class UseTask {

    public static void main(String[] args) {
        Task t1 = new Task("finir exo1", 1);
        Task t2 = new Task("finir exo2", LocalDate.of(2025, 2, 1), LocalDate.of(2025, 3, 1), 2);

        System.out.println(t1);
        System.out.println(t2);

        t1.changeStatus();
        t2.changeStatus(TaskStatus.FINISHED);
        System.out.println(t1);
        System.out.println(t2);

        Task t3 = new Task("finir exo3", LocalDate.of(2025, 2, 1), LocalDate.of(2025, 2, 10), 5);
        Task t4 = new Task("finir exo4", LocalDate.of(2025, 2, 1), LocalDate.of(2025, 2, 10), 5);

        System.out.println(t3);
        if(t3.isLate()) System.out.println("en retard");

        System.out.println(t4);
        if(t4.isLate()) System.out.println("en retard");

        t3.changeStatus(TaskStatus.FINISHED);
        t4.delay(30);

        System.out.println(t3);
        if(t3.isLate()) System.out.println("en retard");

        System.out.println(t4);
        if(t4.isLate()) System.out.println("en retard");
    }
}
