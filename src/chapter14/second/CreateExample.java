package chapter14.second;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateExample {
    public static void main(String[] args) {
        Path path = Path.of("temp2");

        try {
            Files.createDirectory(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
