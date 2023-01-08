package chapter22.first;

public class JoinExample {
    public static void main(String[] args) {
        String[] array = {"2025", "07", "15"};
        System.out.println(String.join("-", array));
        System.out.println(String.join("\n", array));
    }
}
