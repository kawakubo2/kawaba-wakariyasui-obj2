package chapter21;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;

import chapter20.Book;

public class Q21_1 {
    public static void main(String[] args) {
        var list = Book.getList();

        System.out.println("---< 問1 >---");
        boolean result = list.stream()
                .anyMatch(book -> "木村花子".equals(book.author()));
        System.out.println(result);

        System.out.println("---< 問2 >---");
        Optional<Book> anyBook = list.stream()
                .filter(book -> "木村花子".equals(book.author()))
                .findFirst();
        System.out.println(anyBook.get());

        System.out.println("---< 問3 >---");
        String authors = list.stream()
                .map(Book::author)
                .distinct()
                .reduce("", (a, b) -> a + " " + b);
        System.out.println(authors);

        System.out.println("---< 問4 >---");
        OptionalDouble avg = list.stream()
                .mapToInt(Book::price)
                .average();
        System.out.println(avg.getAsDouble());

        System.out.println("---< 問5 >---");
        Optional<Book> book = list.stream()
                .max(Comparator.comparing(Book::price));
        System.out.println(book.get().author());

    }
}
