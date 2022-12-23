package chapter14.first;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteExample {
    public static void main(String[] args) {
        try {
            Path target = Path.of("foo/bar/memo.txt");
            if (Files.exists(target)) {
                Files.delete(target);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
