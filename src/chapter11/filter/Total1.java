package chapter11.filter;

public class Total1 {
    public static void main(String[] args) {
        int[] numbers = { 5, -1, 2, 9, 12, -8, 3, 4, 6};
        System.out.println("正数の合計: " + positiveTotal(numbers));
        System.out.println("偶数の合計: " + evenTotal(numbers));
        System.out.println("正の奇数の合計: " + oddPositiveTotal(numbers));
        System.out.println("正の奇数の合計: " + total(numbers, new PositiveOdd()));
    }
    public static int positiveTotal(int[] numbers) {
        int total = 0;
        for (int n : numbers) {
            if (n > 0) {
                total += n;
            }
        }
        return total;
    }
    public static int evenTotal(int[] numbers) {
        int total = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                total += n;
            }
        }
        return total;
    }
    public static int oddPositiveTotal(int[] numbers) {
        int total = 0;
        for (int n: numbers) {
            if (n > 0 && n % 2 != 0) {
                total += n;
            }   
        }
        return total;
    }
    public static int total(int[] numbers, Filter f) {
        int total = 0;
        for (int n: numbers) {
            if (f.test(n)) {
                total += n;
            }   
        }
        return total;
    }
}
