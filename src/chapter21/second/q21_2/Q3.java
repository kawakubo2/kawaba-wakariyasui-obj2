package chapter21.second.q21_2;

import static java.util.stream.Collectors.*;
import chapter20.first.Book;

public class Q3 {
    public static void main(String[] args) {
        var list = Book.getList();

        String genreList = list.stream()
            .map(Book::genre)
            .distinct()
            .collect(joining(", "));
        System.out.println(genreList);
    }
}
