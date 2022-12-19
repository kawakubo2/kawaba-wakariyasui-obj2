package chapter21.second.q21_1;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;

import chapter20.first.Book;

public class Summary {
    public static void main(String[] args) {
        var list = Book.getList();

        System.out.println("---< 問1 >---");
        boolean result = list.stream()
                .anyMatch(b -> "木村花子".equals(b.author()));
        System.out.println(result);

        System.out.println("---< 問2 >---");
        Optional<Book> anyBook = list.stream()
                .filter(b -> "木村花子".equals(b.author()))
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
