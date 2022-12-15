package chapter11.filter;

public class PositiveOdd implements Filter {
    public boolean test(int n) {
        return n > 0 && n % 2 != 0;
    }
}
