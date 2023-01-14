package chapter23.second;

record User(int id, String name) {}

public class TrimStrip2 {
    public static void main(String[] args) {
        String[] strs = {"   2023       ", "       　　", "　田中　浩  "};
        System.out.println("--- trim ---");
        for (String s: strs) {
            System.out.println(">" + s.trim() + "<");
        }
        System.out.println("--- strip ---");
        for (String s: strs) {
            System.out.println(">" + s.strip() + "<");
        }
        
        String s = "　　　abc　　　";
        System.out.println(">" + s.strip() + "<");
    }
}
