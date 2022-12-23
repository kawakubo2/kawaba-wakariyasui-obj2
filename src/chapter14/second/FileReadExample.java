package chapter14.second;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadExample {
    public static void main(String[] args) {
        Path path = Path.of("openjdk.txt");

        try {
            Files.lines(path)
                .filter(line -> line.startsWith("O"))
                .map(line -> line.substring(0, 20).toUpperCase())
                .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
