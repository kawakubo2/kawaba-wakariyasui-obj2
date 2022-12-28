package chapter22.first.q22_3_1;

import java.time.LocalDate;

public class Q3 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2023,12,24);
        LocalDate d2 = LocalDate.of(2023, 12, 31);

        boolean result = d1.isAfter(d2);
        System.out.println(result);
    }
}
