package chapter14.first;

import java.nio.file.Files;
import java.nio.file.Path;

public class CopyExample {
    public static void main(String[] args) {
        try {
            Path source = Path.of("foo/bar/note.txt");
            Path target = Path.of("temp/note.txt");
            if (!(Files.exists(target))) {
                Files.copy(source, target);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
