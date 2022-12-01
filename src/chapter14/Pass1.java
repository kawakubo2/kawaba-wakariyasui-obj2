package chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Pass1 {
    public static void main(String[] args) {
        // Path p1 = Path.of("text/note.txt");
        // Path p2 = Path.of("books");
        // Path p3 = Path.of("books/pdf/ref.pdf");
        Path p4 = Path.of("hello.html");

        try {
            Files.createFile(p4);
            Path p5 = Path.of("html");
            Files.createDirectory(p5);
            Path p6 = Path.of("html/hello.html");
            Files.move(p4, p6);
            System.out.println(Path.of("").toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
