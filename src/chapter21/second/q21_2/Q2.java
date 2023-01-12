package chapter21.second.q21_2;

import java.util.Map;

import chapter24.first.Book;

import static java.util.stream.Collectors.*;

public class Q2 {
    public static void main(String[] args) {
        var list = Book.getList();

        Map<Integer, String> bookMap =
            list.stream()
                .collect(toMap(Book::number, Book::title));
        bookMap.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
