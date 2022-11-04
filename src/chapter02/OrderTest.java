package chapter02;

import java.time.LocalDate;

public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order("ICBK61", LocalDate.of(2025, 7, 11), 2100, 5, true);
        Order o2 = new Order("ICBK62", LocalDate.of(2025, 9, 2), 1050, 10, false);
        Order o3 = new Order("ICY62", LocalDate.of(2025, 7, 15), 1050, 12, true);
        Order o4 = new Order("ICC62", LocalDate.of(02025, 7, 27), 1050, 18, true);
        Order o5 = new Order("ICM62", LocalDate.of(2025, 8, 22), 1050, 9, false);

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);
        System.out.println(o5);
    }
}
