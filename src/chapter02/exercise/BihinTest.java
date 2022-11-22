package chapter02.exercise;

import java.time.LocalDate;

public class BihinTest {
    public static void main(String[] args) {

        System.out.println("---< 問2 >---");
        Bihin b1 = new Bihin("パソコン", LocalDate.of(2013, 3, 10), 105000, 5);
        Bihin b2 = new Bihin("スキャナー", LocalDate.of(2010, 7, 21), 62500, 1);
        Bihin b3 = new Bihin("書架", LocalDate.of(2015, 10, 1), 138800, 2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        
        System.out.println("---< 問3 >---");
        System.out.println("変更前:" + b1.getDate());
        b1.setDate(LocalDate.of(2013, 4, 1));
        System.out.println("変更後:" + b1.getDate());

        System.out.println("---< 問4 >---");
        LocalDate tempDate = LocalDate.of(2012, 3, 10);
        System.out.println(b1.isAfterBihin(tempDate));
        System.out.println(b2.isAfterBihin(tempDate));
        System.out.println(b3.isAfterBihin(tempDate));
    }
}
