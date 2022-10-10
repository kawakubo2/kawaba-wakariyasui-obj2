package chapter20;

public class Review2 {
    public static void main(String[] args) {
        var list = Book.getList();
        list.stream()
                .filter(book -> "NOVEL".equals(book.genre()))
                .map(Book::title)
                .forEach(System.out::println);
    }

}
