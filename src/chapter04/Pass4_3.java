package chapter04;

import java.util.ArrayList;

public final class Author {
    private final String name;
    private final ArrayList<String> books;
    public Author(String name, ArrayList<String> books) {
        this.name = name;
        this.books = new ArrayList<>();
        for (Book book: books) {
            this.books.add(book);
        }
    }
    public String getName() {
        return name;
    }
    public ArrayList<String> getBooks() {
        ArrayList<String> result = new ArrayList<>();
        for (Book book: this.books) {
            result.add(book);
        }
        return result;
    }
}