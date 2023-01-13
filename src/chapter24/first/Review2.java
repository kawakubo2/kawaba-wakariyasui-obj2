package chapter24.first;

public class Review2 {
    public static void main(String[] args) {
        var books = Book.getList();

        books.stream()
            .filter(book -> Genre.SCIENCE == book.genre())
            .forEach(book -> System.out.println(book.title()));
    }
}
