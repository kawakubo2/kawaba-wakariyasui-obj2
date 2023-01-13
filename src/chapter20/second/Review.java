package chapter20.second;

import java.util.Comparator;

public class Review {
    public static void main(String[] args) {
        var list = Book.getList();

        System.out.println("---< 問1 >---");
        list.stream()
            .filter(b -> !b.stock())
            .forEach(System.out::println);

        System.out.println("---< 問2 >---");
        list.stream()
            .filter(b -> "NOVEL".equals(b.genre()))
            .map(Book::title)
            .forEach(System.out::println);

        System.out.println("---< 問3 >---");
        list.stream()
            .filter(b -> "田中宏".equals(b.author()))
            .sorted(Comparator.comparing(Book::price))
            .forEach(System.out::println);

        System.out.println("---< 問4 >---");
        list.stream()
            .sorted(Comparator.comparing(Book::price))
            .skip(2)
            .limit(3)
            .forEach(System.out::println);

        System.out.println("---< 問5 >---");
        list.stream()
            .map(Book::genre)
            .distinct()
            .sorted()
            .forEach(System.out::println);

    }
}
