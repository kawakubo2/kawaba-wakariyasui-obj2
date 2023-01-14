package chapter23.second;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ConstructorExample {
    public static void main(String[] args) {
        try {
            byte[] bytes = Files.readAllBytes(Path.of("sample.html"));

            String str = new String(bytes, "UTF-8");
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
