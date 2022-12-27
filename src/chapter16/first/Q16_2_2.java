package chapter16.first;

import java.time.LocalDate;
import java.util.ArrayList;

record Order(String code, int quantity, LocalDate date) {}

public class Q16_2_2 {
    public static void main(String[] args) {
        var o1 = new Order("A-202", 3, LocalDate.of(2025, 3,1));
        var o2 = new Order("A-203", 5, LocalDate.of(2025, 3, 4));
        var list = new ArrayList<Order>();
        list.add(o1);
        list.add(o2);
        for (Order o: list) {
            System.out.println(o);
        }
    }
}
