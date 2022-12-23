package chapter14.second;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MoveExample {
    public static void main(String[] args) {
        Path source = Path.of("temp/memo.txt");
        Path target = Path.of("foo/bar/memo.txt");

        try {
            Files.move(source, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
