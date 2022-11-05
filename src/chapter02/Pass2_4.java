package chapter02;

import java.time.LocalDate;

public class Pass2_4 {
    public static void main(String[] args) {
        Bihin[] bihins = {
            new Bihin("パソコン", LocalDate.of(2013,3,10), 105000, 5),
            new Bihin("スキャナー", LocalDate.of(2010, 7, 21), 62500, 1),
            new Bihin("書架", LocalDate.of(2015, 10, 1), 138800,2),
        };

        LocalDate d = LocalDate.of(2011, 12, 23);
        for (Bihin b: bihins) {
            System.out.println(b.isAfterBihin(d));
        }
    }
}
