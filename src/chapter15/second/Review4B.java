package chapter15.second;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Review4B {
    public static void main(String[] args) {
        Path path = Path.of("mydata.txt");
        try (Scanner in = new Scanner(path, "UTF-8");) {
            while (in.hasNext()) {
                System.out.printf("|%d|\t|%s|\t|%.1f|%n",
                    in.nextInt(),
                    in.next(),
                    in.nextDouble() 
                );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
