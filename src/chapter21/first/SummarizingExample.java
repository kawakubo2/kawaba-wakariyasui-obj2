package chapter21.first;

import static java.util.stream.Collectors.*;

import java.util.IntSummaryStatistics;

import chapter24.first.Book;

public class SummarizingExample {
    public static void main(String[] args) {
        var list = Book.getList();

        IntSummaryStatistics stat = list.stream()
                .collect(summarizingInt(Book::price));

        System.out.println("件数: " + stat.getCount());
        System.out.println("合計: " + stat.getSum());
        System.out.println("平均: " + stat.getAverage());
        System.out.println("最大: " + stat.getMax());
        System.out.println("最小: " + stat.getMin());
    }
}
