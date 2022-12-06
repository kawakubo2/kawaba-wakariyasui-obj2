package chapter15;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.Scanner;

public class ScanOrder {
    public static void main(String[] args) {
        Path path = Path.of("order.txt");
        try (Scanner in = new Scanner(path, Charset.forName("UTF-8"));) {
            while(in.hasNext()) {
                String code = in.next();
                String date = in.next();
                int quantity = in.nextInt();
                System.out.println(code + "/" + date + "/" + quantity);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
