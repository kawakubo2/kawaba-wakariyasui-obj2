package chapter12;

public class ExceptionSample2 {
    public static void main(String[] args) {
        // int[] numbers = {};
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            double avg = average(numbers);
            System.out.println("平均=" + avg);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public static double average(int[] nums) throws IllegalArgumentException {
        if (nums.length == 0) {
            throw new IllegalArgumentException("要素数が0");
        }
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        return (double)total / nums.length;
    }
}
