package chapter14.first;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteExample2 {
    public static void main(String[] args) {
        try {
            Path target = Path.of("foo/bar/note.txt");
            Files.deleteIfExists(target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
