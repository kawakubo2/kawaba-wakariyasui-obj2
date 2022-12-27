package chapter15.second;

import java.io.PrintWriter;

public class Review2 {
    public static void main(String[] args) {
        try (PrintWriter out = new PrintWriter("mydata.txt", "UTF-8");) {
            out.print("3001" + "\t");
            out.print("山田隆二" + "\t");
            out.println(70.2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
