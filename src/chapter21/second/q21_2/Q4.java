package chapter21.second.q21_2;

import java.util.Optional;

import static java.util.stream.Collectors.*;

import java.util.Comparator;

import chapter20.first.Book;

public class Q4 {
    public static void main(String[] args) {
        var list = Book.getList();

        Optional<Book> maxPrice 
            = list.stream()
                .collect(maxBy(Comparator.comparing(Book::price)));
        System.out.println(maxPrice.get());
    }
}
