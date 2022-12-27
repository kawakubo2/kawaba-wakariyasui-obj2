package chapter15.second;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class Review1 {
    public static void main(String[] args) {
        Path path = Path.of("openjdk.txt");
        try (BufferedReader in = Files.newBufferedReader(path, Charset.forName("UTF-8"));) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
