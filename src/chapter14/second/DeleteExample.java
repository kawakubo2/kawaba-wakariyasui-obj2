package chapter14.second;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteExample {
    public static void main(String[] args) {
        Path target = Path.of("foo/bar/memo.txt");
        try {
            Files.deleteIfExists(target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
