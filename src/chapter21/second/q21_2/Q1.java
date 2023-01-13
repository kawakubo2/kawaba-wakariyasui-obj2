package chapter21.second.q21_2;

import java.util.List;
import java.util.Map;

import chapter21.second.Book;

import static java.util.stream.Collectors.*;

public class Q1 {
    public static void main(String[] args) {
        var list = Book.getList();

        Map<String, List<String>> genre =
            list.stream()
                .collect(groupingBy(Book::genre, mapping(Book::title, toList())));

        genre.forEach((k, v) -> System.out.println(k + "=" + v));
    }
}
