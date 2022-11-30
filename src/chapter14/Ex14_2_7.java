package chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex14_2_7 {
    public static void main(String[] args) {
        String text = """
                java.nio.fileパッケージにはファイル入出力に利用するクラスがあります。
                特に、Pathインタフェースと、Filesクラスには有用なメソッドがあります。
                Pathインタフェースはjava.ioのFileクラスに代わるものです。
                """;
        try {
            Path target = Path.of("sample.txt");
            Files.writeString(target, text);

            System.out.println(Files.readString(target));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
