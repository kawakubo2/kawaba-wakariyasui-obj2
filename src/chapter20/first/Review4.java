package chapter20.first;

import java.util.Comparator;

import chapter24.first.Book;

public class Review4 {
    public static void main(String[] args) {
        var list = Book.getList();
        list.stream()
                .sorted(Comparator.comparing(Book::price))
                .skip(2)
                .limit(3)
                .forEach(System.out::println);
    }

}
