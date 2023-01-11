package chapter23.first;

public class Review1 {
    public static void main(String[] args) {
        byte[] bytes = { 0x61, 0x62, 0x63 };
        String s1 = new String(bytes);
        System.out.println(s1);
        String s2 = "abc";
        System.out.println(s1 == s2);
    }
}
