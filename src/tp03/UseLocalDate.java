package tp03;

import java.time.LocalDate;
import java.util.Random;

class UseLocalDate {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2007, 2, 2);
        System.out.println(d1);
        System.out.println(d2);
        Random r = new Random();
        LocalDate d3 = d1.minusDays(r.nextInt(365 * 30)+1);
        System.out.println(d3);
        if (d3.isBefore(d2)) {
            System.out.println("plus vieux: " + d3);
        } else {
            System.out.println("plus vieux: " + d2);
        }
        System.out.println(d1.plusDays(7));
        System.out.println("j'ai " + d2.until(d1).getYears() + " ans.");
    }
}
