package chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateExample3 {
    public static void main(String[] args) {
        try {
            Path path = Path.of("foo/bar/note.txt");
            if (!(Files.exists(path))) {
                Files.createFile(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
