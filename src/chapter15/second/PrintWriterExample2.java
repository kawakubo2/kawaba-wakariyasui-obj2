package chapter15.second;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample2 {
    public static void main(String[] args) {
        try (PrintWriter out = new PrintWriter("data.txt", "UTF-8");) {
            out.print(100);
            out.print("\t");
            out.print("田中浩");
            out.print("\t");
            out.println(60.5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
