package chapter22.first;

import java.time.LocalDate;

public class CompareExample {
    public static void main(String[] args) {
        var date1 = LocalDate.of(2025, 1, 10);
        var date2 = LocalDate.of(2014, 12, 6);
        var date3 = LocalDate.of(2025, 1, 10);

        System.out.println(date1.isAfter(date2));
        System.out.println(date1.isAfter(date3));
        System.out.println(date1.isAfter(date2));
        System.out.println(date1.isEqual(date2));
        System.out.println(date1.isEqual(date3));
    }
}
