package chapter15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Review3 {
    public static void main(String[] args) {
        Path path = Path.of("mydata.txt");
        try (BufferedWriter out = Files.newBufferedWriter(
                path, 
                Charset.forName("UTF-8"), 
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);) {
            out.write(3002 + "\t");
            out.write("鈴木一郎" + "\t");
            out.write(82.6 + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
