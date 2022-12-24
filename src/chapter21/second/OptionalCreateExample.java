package chapter21.second;

import java.util.Optional;

record Book(String title, String author) {}

public class OptionalCreateExample {
    public static void main(String[] args) {
        Optional<Book> op1 = Optional.empty();
        Optional<Book> op2 = Optional.of(new Book("夏目漱石", "坊っちゃん"));
        Book book = null;
        Optional<Book> op3 = Optional.ofNullable(book);

        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);
    }
}
