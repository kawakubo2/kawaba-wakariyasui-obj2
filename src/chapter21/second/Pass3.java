package chapter21.second;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class Pass3 {
    public static void main(String[] args) {
        Path source = Path.of("nagasaki_ms932.txt");
        Path target = Path.of("nagasaki_utf8.txt");
        try {
            String s = Files.readString(source, Charset.forName("MS932"));
            Files.writeString(target, s, Charset.forName("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
