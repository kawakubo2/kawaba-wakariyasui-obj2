package chapter23.first.q23_1_4;

public class Q1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(100);
        sb.append("abcde").append(123);
        System.out.println(sb);
        sb.insert(3, "XXX");
        System.out.println(sb);
        sb.replace(5, 7, "@");
        System.out.println(sb);
        int len = sb.length();
        System.out.println(len);
        String str = sb.reverse().toString();
        System.out.println(str);
    }
}
