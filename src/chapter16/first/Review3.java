package chapter16.first;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

record Parking (int pnumber, LocalDate date, String number) {}

public class Review3 {
    public static void main(String[] args) {
        var list = new ArrayList<Parking>();
        list.add(new Parking(102, LocalDate.of(2025, 7, 8), "Y-111-222"));        
        list.add(new Parking(205, LocalDate.of(2025, 10, 1), "Z-111-222"));        
        list.add(new Parking(101, LocalDate.of(2025, 3, 12), "X-111-222"));        
        
        list.sort(Comparator.comparing(Parking::pnumber));
        for (Parking p: list) {
            System.out.println(p);
        }
    }
}
