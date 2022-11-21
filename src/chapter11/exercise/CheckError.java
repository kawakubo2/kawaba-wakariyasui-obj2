package chapter11.exercise;

public class CheckError {
    public static void main(String[] args) {
        int[] numbers = {110, 30, 50, 9, 58, 21};
        System.out.println("---< 問1 >---");
        findError(numbers, new Check01());
        System.out.println("---< 問2 >---");
        findError(numbers, new Check02());
    }
    public static void findError(int[] numbers, CheckNumber t) {
        for (int n : numbers) {
            if (t.test(n)) {
                System.out.println(n);
            }
        }
    }
}
