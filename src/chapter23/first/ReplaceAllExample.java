package chapter23.first;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReplaceAllExample {
    public static void main(String[] args) {
        try {
            Files.lines(Path.of("sample.html"))
                .forEach(s -> System.out.println(s.replaceAll("<.+?>", "")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
