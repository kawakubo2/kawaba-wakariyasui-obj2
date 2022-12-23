package chapter21.second;

import static java.util.stream.Collectors.*;

import java.util.Comparator;
import java.util.Optional;

import chapter20.first.Book;

public class CalculatingExample {
    public static void main(String[] args) {
        var list = Book.getList();

        long count = list.stream().collect(counting());
        int sum = list.stream().collect(summingInt(Book::price));
        double avg = list.stream().collect(averagingDouble(Book::price));
        Optional<Book> max = list.stream().collect(maxBy(Comparator.comparing(Book::price)));
        Optional<Book> min = list.stream().collect(minBy(Comparator.comparing(Book::price)));

        System.out.println("件　数=" + count);
        System.out.println("合　計=" + sum);
        System.out.println("平　均=" + avg);
        System.out.println("最高値=" + max.get());
        System.out.println("最安値=" + min.get());
    }
}
