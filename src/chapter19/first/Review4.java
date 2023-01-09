package chapter19.first;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Review4 {
    public static void main(String[] args) {
        // (2)
        System.out.println("(2)");
        final String str = "abc";
        Predicate<String> pred1 = str::equals;
        System.out.println(pred1.test("abc"));
        System.out.println(pred1.test("abcde"));

        // (3)
        System.out.println("(3)");
        Function<Book, Integer> func1 = Book::price;
        Book book1 = new Book(1001, "坂の上の雲", 3000);
        System.out.println(func1.apply(book1));

        // (5)
        System.out.println("(5)");
        Supplier<Double> sup1 = Math::random;
        System.out.println(sup1.get());
        System.out.println(sup1.get());
        System.out.println(sup1.get());
    }
}
