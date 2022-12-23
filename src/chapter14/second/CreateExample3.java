package chapter14.second;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateExample3 {
    public static void main(String[] args) {
        Path path = Path.of("foo/bar/note.txt");
        try {
            Files.createFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
