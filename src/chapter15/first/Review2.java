package chapter15.first;

import java.io.IOException;
import java.io.PrintWriter;
public class Review2 {
    public static void main(String[] args) {
        String path = "mydata.txt";
        try (PrintWriter out = new PrintWriter(path, "UTF-8");) {
            out.print(3001);
            out.print("\t");
            out.print("山田隆二");
            out.print("\t");
            out.print(70.2);
            out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
