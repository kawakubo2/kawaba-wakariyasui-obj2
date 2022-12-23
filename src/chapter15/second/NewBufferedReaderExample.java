package chapter15.second;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewBufferedReaderExample {
    public static void main(String[] args) {
        Path path = Path.of("nagasaki.txt");
        try {
            BufferedReader in = Files.newBufferedReader(path);
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
