package chapter21;

import java.util.List;
import java.util.Optional;

import chapter20.first.Book;

import static java.util.stream.Collectors.*;

import java.util.Comparator;

public class CalculatingExample {
    public static void main(String[] args) {
        List<Book> list = Book.getList();
        // 件数
        long count = list.stream()
                .collect(counting());
        // 合計
        int sum = list.stream()
                .collect(summingInt(Book::price));
        // 平均
        double avg = list.stream()
                .collect(averagingInt(Book::price));
        // 最大
        Optional<Book> max = list.stream()
                .collect(maxBy(Comparator.comparing(Book::price)));
        // 最小
        Optional<Book> min = list.stream()
                .collect(minBy(Comparator.comparing(Book::price)));

        System.out.println("件数: " + count);
        System.out.println("合計: " + sum);
        System.out.println("平均: " + avg);
        System.out.println("最大: " + max);
        System.out.println("最小: " + min);
    }
}
