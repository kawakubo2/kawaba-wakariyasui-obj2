package chapter15.second;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test {
    public static void main(String[] args) {
        Path path = Path.of("nagasaki.txt");
        Path path2 = Path.of("nagasaki2.txt");

        try (BufferedReader in = Files.newBufferedReader(path, Charset.forName("UTF-8")); 
             PrintWriter out = new PrintWriter(path2.toFile());  
        ){
            String line;
            while((line = in.readLine()) != null) {
                out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
