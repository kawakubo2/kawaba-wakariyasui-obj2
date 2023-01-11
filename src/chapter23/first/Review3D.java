package chapter23.first;

public class Review3D {
    public static void main(String[] args) {
        String pattern = "^￥\\d{1,3},\\d{3}$";
        String[] ok = { "￥123,456", "￥12,345", "￥1,234" }; 
        String[] ng = { "￥456", "￥1,234,456", "￥1234", "1,234", "1.234" }; 
        System.out.println("---< okパターン >---");
        test(pattern, ok);
        System.out.println("---< ngパターン >---");
        test(pattern, ng);
    }
    public static void test(String pattern, String[] targets) {
        for (String s: targets) {
            System.out.print(s + ": ");
            if (s.matches(pattern)) {
                System.out.println("○");
            } else {
                System.out.println("×");
            }
        }
    }
}
