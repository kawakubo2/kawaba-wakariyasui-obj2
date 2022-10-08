package chapter19;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Review1 {
    public static void main(String[] args) {
        Supplier<Student> sup = () -> new Student();
        System.out.println(sup.get());

        Predicate<String> pred = s1 -> s1 == null;
        String str1 = null;
        System.out.println(pred.test(str1));

        Consumer<Student> con = s2 -> System.out.println(s2);;
        Student student2 = new Student(101, "横山花子");
        con.accept(student2); 

        Function<Book, Integer> func = b1 -> b1.price();
        Book book = new Book(1234, "峠", 2000);
        System.out.println(func.apply(book));
    }
}
