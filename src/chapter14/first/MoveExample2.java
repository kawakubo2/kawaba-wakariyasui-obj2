package chapter14.first;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MoveExample2 {
    public static void main(String[] args) {
        try {
            Path source = Path.of("temp/memo.txt");
            Path target = Path.of("foo/bar/memo.txt");
            if (!Files.exists(target)) {
                Files.move(source, target);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
