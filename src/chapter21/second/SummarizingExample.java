package chapter21.second;

import static java.util.stream.Collectors.*;

import java.util.IntSummaryStatistics;

import chapter24.first.Book;

public class SummarizingExample {
    public static void main(String[] args) {
        var list = Book.getList();
        
        IntSummaryStatistics stat = list.stream()
            .collect(summarizingInt(Book::price));

        System.out.println("件　数=" + stat.getCount());
        System.out.println("合　計=" + stat.getSum());
        System.out.println("平　均=" + stat.getAverage());
        System.out.println("最大値=" + stat.getMax());
        System.out.println("最小値=" + stat.getMin());
    }
}
