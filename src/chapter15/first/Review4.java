package chapter15.first;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.Scanner;

public class Review4 {
    public static void main(String[] args) {
        Path path = Path.of("mydata.txt");
        try (Scanner in = new Scanner(path, Charset.forName("UTF-8"));) {
            while (in.hasNext()) {
                System.out.printf("|%d|\t|%s|\t|%.1f|%n", in.nextInt(), in.next(), in.nextDouble());
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
