package chapter14.first;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class Pass3 {
    public static void main(String[] args) {
        try {
            String text = Files.readString(Path.of("nagasaki_ms932.txt"), Charset.forName("MS932"));

            Files.writeString(Path.of("nagasaki.txt"), text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
