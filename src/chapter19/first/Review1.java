package chapter19.first;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Review1 {
    public static void main(String[] args) {
        // (1)
        Supplier<Student> sup = () -> new Student();
        System.out.println(sup.get());

        // (2)
        Predicate<String> pred = s1 -> s1 == null;
        String str1 = null;
        System.out.println(pred.test(str1));

        // (3)
        Consumer<Student> con = s2 -> System.out.println(s2.name());;
        Student student2 = new Student(101, "横山花子");
        con.accept(student2); 

        // (4)
        Function<Book, Integer> func = b1 -> b1.price();
        Book book = new Book(1234, "峠", 2000);
        System.out.println(func.apply(book));
    }
}
