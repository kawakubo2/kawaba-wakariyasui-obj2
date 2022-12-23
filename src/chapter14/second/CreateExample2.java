package chapter14.second;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateExample2 {
    public static void main(String[] args) {
        Path path = Path.of("foo/bar");
        try {
            Files.createDirectories(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
