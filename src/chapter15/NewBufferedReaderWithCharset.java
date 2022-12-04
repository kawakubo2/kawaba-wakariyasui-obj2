package chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewBufferedReaderWithCharset {
    public static void main(String[] args) {
        Path path = Path.of("nagasaki_ms932.txt");
        try (BufferedReader in = Files.newBufferedReader(path, Charset.forName("MS932"));) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
