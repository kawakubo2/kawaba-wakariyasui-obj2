package chapter23.first;

public class Test {
    public static void main(String[] args) {
        byte[] bytes = { 0x61, 0x62, 0x63 };
        String s1 = new String(bytes);
        System.out.println(s1);
    }
}
