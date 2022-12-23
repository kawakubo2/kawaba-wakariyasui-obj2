package chapter14.second;

import java.io.IOException;
import java.nio.file.Path;

import org.apache.commons.io.FileUtils;

public class DeleteExample3 {
    public static void main(String[] args) {
        Path target = Path.of("foo");
        try {
            FileUtils.deleteDirectory(target.toFile());
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
    
}
