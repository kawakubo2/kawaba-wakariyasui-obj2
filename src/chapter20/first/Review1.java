package chapter20.first;

public class Review1 {
    public static void main(String[] args) {
        var list = Book.getList();
        list.stream()
                .filter(book -> !book.stock())
                .forEach(System.out::println);
    }

}