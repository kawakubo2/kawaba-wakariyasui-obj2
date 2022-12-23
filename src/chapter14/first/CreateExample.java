package chapter14.first;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateExample {
    public static void main(String[] args) {
        try {
            Path path = Path.of("temp");
            if (!(Files.exists(path))) {
                Files.createDirectory(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
