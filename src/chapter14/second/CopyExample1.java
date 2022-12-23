package chapter14.second;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyExample1 {
    public static void main(String[] args) {
        Path source = Path.of("foo/bar/note.txt");
        Path target = Path.of("temp/note.txt");

        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
