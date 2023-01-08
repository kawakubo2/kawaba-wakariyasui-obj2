package chapter22.first;

public class ReplaceExample {
    public static void main(String[] args) {
        String users = """
                2025,田中宏
                2026,佐藤次郎
                2024,木村健
                """;
        System.out.println(users.replace(",", "-"));
    }
}
