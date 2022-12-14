package chapter19.first;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;


public class Review2 {
    public static void main(String[] args) {
        // (1)
        Consumer<Book> con1 = book -> System.out.println(book.title());
        con1.accept(new Book(101, "羅生門", 500));

        // (2)
        Supplier<String> sup1 = () -> "100";
        System.out.println(sup1.get());

        // (3)
        Predicate<Book> pred1 = book1 -> book1.price() > 2000;
        Book b1 = new Book(123457, "わかりやすいJavaオブジェクト指向編", 2800);
        System.out.println(pred1.test(b1));

        // (4)
        Function<Student, Integer> func1 = student1 -> student1.name().length();
        Student s1 = new Student(102, "田中一郎");
        System.out.println(func1.apply(s1));

        // (5)
        UnaryOperator<Double> una1 = d1 -> Math.pow(d1, 5);
        double d1 = 2.51188643150958;
        System.out.println(una1.apply(d1));

        // (6)
        BiConsumer<String, Integer> bic1 = (str1, i) -> System.out.println(str1.charAt(i));
        bic1.accept("Java", 2);


    }
}
