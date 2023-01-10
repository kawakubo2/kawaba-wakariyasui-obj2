package chapter23.first;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Path path = Path.of("data.txt");
        try (Scanner in = new Scanner(path, "UTF-8");) {
            in.useDelimiter("[ \t]+|" + System.lineSeparator());
            while (in.hasNext()) {
                System.out.printf("%d\t%s\t%.1f%n",
                    in.nextInt(), in.next(), in.nextDouble()
                );
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
