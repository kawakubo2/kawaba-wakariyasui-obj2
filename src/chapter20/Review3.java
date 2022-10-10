package chapter20;

import java.util.Comparator;

public class Review3 {
    public static void main(String[] args) {
        var list = Book.getList();
        list.stream()
                .filter(book -> "田中宏".equals(book.author()))
                .sorted(Comparator.comparing(Book::price))
                .forEach(System.out::println);
    }

}
