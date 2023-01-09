package chapter19.first;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

record Book(int code, String title, int price) {}

public class Q19_3_2 {
    public static void main(String[] args) {

        var books = new ArrayList<Book>();
        books.add(new Book(1001, "吾輩は猫である", 400));
        books.add(new Book(1002, "明暗", 500));
        books.add(new Book(1003, "坊っちゃん", 450));

        test1(books, Book::title);
    
        String str1 = "こんにちは、世界！";
        test2(str1, 6, String::charAt);

        String msg = "Hello";
        String str2 = "Hello";
        test3(str2, msg::equals);

        int id = 103;
        String name = "猫山五郎";
        test4(id, name, Student::new);

        test5(ArrayList<String>::new);
    }
    public static void test1(List<Book> books, Function<Book, String> func) {
        for (Book book: books) {
            System.out.println(func.apply(book));
        }
    }
    public static void test2(String str, Integer pos, BiFunction<String, Integer, Character> func) {
        System.out.println(func.apply(str, pos));
    }
    public static void test3(String str, Predicate<String> func) {
        System.out.println(func.test(str));
    }
    public static void test4(Integer id, String name, BiFunction<Integer, String, Student> func) {
        System.out.println(func.apply(id, name));
    }
    public static void test5(Supplier<List<String>> func) {
        List<String> list = (List<String>)func.get();
        System.out.println(list);
    }
}

