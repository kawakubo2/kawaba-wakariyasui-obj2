package chapter22.first;

import java.time.LocalDate;
import java.util.Arrays;

public class CreateDate2 {
    public static void main(String[] args) {
        String s = "2025-05-01";
        int[] a = Arrays.stream(s.split("[/.-]"))
            .mapToInt(Integer::parseInt)
            .toArray();
        LocalDate date = LocalDate.of(a[0], a[1], a[2]);
        System.out.println(date);
    }
}
